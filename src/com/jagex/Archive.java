package com.jagex;
import sign.signlink;

public class Archive {

	/**
	 * The total size of the archive
	 */
    public int size;
    
    /**
     * The file buffer
     */
    public byte[] fileBuffer;
    
    /**
     * The file name hash values
     */
    public int[] identifiers;
    
    /**
     * Array containing information about the size when the file is decompressed
     */
    public int[] fileSizeDecompressed;
    
    /**
     * Array containing information about the size when the file is compressed
     */
    public int[] fileSizeCompressed;
    
    /**
     * Pointer to the start of the file in the buffer
     */
    public int[] filePointer;
    
    /**
     * Indicates the archive is compressed as a whole
     */
    public boolean compressed;

    /**
     * Create a new archive for the given file data
     * 
     * @param data
     */
	public Archive(byte data[]) {
		unpack(data);
	}

	/**
	 * Unpacks the data given
	 * 
	 * @param data
	 */
	public void unpack(byte data[]) {
		try {
			Buffer buffer = new Buffer(data);
			int size_decompressed = buffer.getUnsignedTriByte();
			int size_compressed = buffer.getUnsignedTriByte();
			if (size_compressed != size_decompressed) {
				byte decompressedBuffer[] = new byte[size_decompressed];
				BZIP2Decompressor.decompress(decompressedBuffer, size_decompressed, data, size_compressed, 6);
				fileBuffer = decompressedBuffer;
				buffer = new Buffer(fileBuffer);
				compressed = true;
			} else {
				fileBuffer = data;
				compressed = false;
			}
			size = buffer.getUnsignedShort();
			identifiers = new int[size];
			fileSizeDecompressed = new int[size];
			fileSizeCompressed = new int[size];
			filePointer = new int[size];
			int pointer = buffer.pointer + size * 10;
			for (int l = 0; l < size; l++) {
				identifiers[l] = buffer.getUnsignedInt();
				fileSizeDecompressed[l] = buffer.getUnsignedTriByte();
				fileSizeCompressed[l] = buffer.getUnsignedTriByte();
				filePointer[l] = pointer;
				pointer += fileSizeCompressed[l];
			}
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("9624, " + ", " + data + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	/**
	 * Gets an entry by name. Will fill the given byte array if it is specified
	 * 
	 * @param identifier
	 * @param data
	 * @return
	 */
	public byte[] entry(String identifier, byte data[]) {
		int hash = 0;
		identifier = identifier.toUpperCase();
		for (int j = 0; j < identifier.length(); j++) {
			hash = (hash * 61 + identifier.charAt(j)) - 32;
		}
		for (int i = 0; i < size; i++) {
			if (identifiers[i] == hash) {
				if (data == null) {
					data = new byte[fileSizeDecompressed[i]];
				}
				if (!compressed) {
					BZIP2Decompressor.decompress(data, fileSizeDecompressed[i], fileBuffer, fileSizeCompressed[i], filePointer[i]);
				} else {
					for (int j = 0; j < fileSizeDecompressed[i]; j++) {
						data[j] = fileBuffer[filePointer[i] + j];
					}
				}
				return data;
			}
		}
		return null;
	}

}