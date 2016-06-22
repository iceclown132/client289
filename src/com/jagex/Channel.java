package com.jagex;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Jagex' wrapper for the networking
 * 
 * @author red
 *
 */
public class Channel implements Runnable {
	
	/**
	 * The input stream
	 */
	public InputStream inputstream;
	
	/**
	 * The output stream
	 */
	public OutputStream outputstream;
	
	/**
	 * The socket
	 */
	public Socket socket;
	
	/**
	 * Indicates the socket is closed
	 */
	public boolean closed;
	
	/**
	 * The applet
	 */
	public RSApplet applet;
	
	/**
	 * The buffer that all the data is read to before getting passed on to
	 * the client
	 */
	public byte[] buffer;
	
	/**
	 * The current write pointer
	 */
	public int writePointer;
	
	/**
	 * The current read pointer
	 */
	public int readPointer;
	
	/**
	 * Indicates this socket is writing
	 */
	public boolean writer;
	
	/**
	 * Indicates the socket should be closed
	 */
	public boolean shutdown;

	/**
	 * 
	 * @param socket
	 * @param applet
	 * @throws IOException
	 */
	public Channel(Socket socket, RSApplet applet) throws IOException {
		this.closed = false;
		this.writer = false;
		this.shutdown = false;
		try {
			this.applet = applet;
			this.socket = socket;
			this.socket.setSoTimeout(30000);
			this.socket.setTcpNoDelay(true);
			
			this.inputstream = socket.getInputStream();
			this.outputstream = socket.getOutputStream();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	/**
	 * Closes this input stream and releases any system resources associated
	 * with the stream.
	 * 
	 * The close method of InputStream does nothing.
	 * 
	 * Specified by: close() in Closeable
	 * 
	 * @Throws IOException - if an I/O error occurs.
	 */
	public void close() {
		closed = true;
		try {
			if (inputstream != null) {
				inputstream.close();
			}
			if (outputstream != null) {
				outputstream.close();
			}
			if (socket != null) {
				socket.close();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		writer = false;
		synchronized (this) {
			notify();
		}
		buffer = null;
    }

    /**
	 * Reads the next byte of data from the input stream. The value byte is
	 * returned as an int in the range 0 to 255. If no byte is available because
	 * the end of the stream has been reached, the value -1 is returned. This
	 * method blocks until input data is available, the end of the stream is
	 * detected, or an exception is thrown.
	 * 
	 * A subclass must provide an implementation of this method.
	 * 
	 * @Return the next byte of data, or -1 if the end of the stream is
	 * reached.
	 * 
	 * @Throws IOException - if an I/O error occurs.
	 */
	public int read() throws IOException {
		return closed ? 0 : inputstream.read();
	}

	/**
	 * Returns an estimate of the number of bytes that can be read (or skipped
	 * over) from this input stream without blocking by the next invocation of a
	 * method for this input stream. The next invocation might be the same
	 * thread or another thread. A single read or skip of this many bytes will
	 * not block, but may read or skip fewer bytes.
	 * 
	 * Note that while some implementations of InputStream will return the total
	 * number of bytes in the stream, many will not. It is never correct to use
	 * the return value of this method to allocate a buffer intended to hold all
	 * data in this stream.
	 * 
	 * A subclass' implementation of this method may choose to throw an
	 * IOException if this input stream has been closed by invoking the close()
	 * method.
	 * 
	 * The available method for class InputStream always returns 0.
	 * 
	 * This method should be overridden by subclasses.
	 * 
	 * @Return an estimate of the number of bytes that can be read (or skipped
	 * over) from this input stream without blocking or 0 when it reaches the
	 * end of the input stream.
	 * 
	 * @Throws IOException - if an I/O error occurs.
	 */
	public int available() throws IOException {
		return closed ? 0 : inputstream.available();
	}

	/**
	 * Reads up to len bytes of data from the input stream into an array of
	 * bytes. An attempt is made to read as many as len bytes, but a smaller
	 * number may be read. The number of bytes actually read is returned as an
	 * integer.
	 * 
	 * This method blocks until input data is available, end of file is
	 * detected, or an exception is thrown.
	 * 
	 * If len is zero, then no bytes are read and 0 is returned; otherwise,
	 * there is an attempt to read at least one byte. If no byte is available
	 * because the stream is at end of file, the value -1 is returned;
	 * otherwise, at least one byte is read and stored into b.
	 * 
	 * The first byte read is stored into element b[off], the next one into
	 * b[off+1], and so on. The number of bytes read is, at most, equal to len.
	 * Let k be the number of bytes actually read; these bytes will be stored in
	 * elements b[off] through b[off+k-1], leaving elements b[off+k] through
	 * b[off+len-1] unaffected.
	 * 
	 * In every case, elements b[0] through b[off] and elements b[off+len]
	 * through b[b.length-1] are unaffected.
	 * 
	 * The read(b, off, len) method for class InputStream simply calls the
	 * method read() repeatedly. If the first such call results in an
	 * IOException, that exception is returned from the call to the read(b, off,
	 * len) method. If any subsequent call to read() results in a IOException,
	 * the exception is caught and treated as if it were end of file; the bytes
	 * read up to that point are stored into b and the number of bytes read
	 * before the exception occurred is returned. The default implementation of
	 * this method blocks until the requested amount of input data len has been
	 * read, end of file is detected, or an exception is thrown. Subclasses are
	 * encouraged to provide a more efficient implementation of this method.
	 * 
	 * @Param b the buffer into which the data is read.
	 * @Param off the start offset in array b at which the data is written.
	 * @Param len the maximum number of bytes to read.
	 * 
	 * @Returns the total number of bytes read into the buffer,
	 * or -1 if there is no more data because the end of the stream has been
	 * reached.
	 * 
	 * @Throws IOException - If the first byte cannot be read for any
	 * reason other than end of file, or if the input stream has been closed, or
	 * if some other I/O error occurs. NullPointerException - If b is null.
	 * IndexOutOfBoundsException - If off is negative, len is negative, or len
	 * is greater than b.length - off 
	 * 
	 * @See java.io.InputStream.read()
	 */
	public void read(byte buffer[], int offset, int length) throws IOException {
		if (closed) {
			return;
		}
		for (int bytesRead = 0; length > 0; length -= bytesRead) {
			bytesRead = inputstream.read(buffer, offset, length);
			if (bytesRead <= 0) {
				throw new IOException("EOF");
			}
			offset += bytesRead;
		}
	}

	/**
	 * 
	 * @param data
	 * @param offset
	 * @param length
	 * @throws IOException
	 */
	public void write(byte data[], int offset, int length) throws IOException {
		if (closed) {
			return;
		}
		if (shutdown) {
			shutdown = false;
			throw new IOException("Error in writer thread");
		}
		if (buffer == null) {
			buffer = new byte[5000];
		}
		synchronized (this) {
			for (int l = 0; l < length; l++) {
				buffer[readPointer] = data[l + offset];
				readPointer = (readPointer + 1) % 5000;
				if (readPointer == (writePointer + 4900) % 5000) {
					throw new IOException("buffer overflow");
				}
			}
			if (!writer) {
				writer = true;
				applet.submit(this, 3);
			}
			notify();
		}
	}

	public void run() {
		while (writer) {
			int i;
			int j;
			synchronized (this) {
				if (readPointer == writePointer) {
					try {
						wait();
					} catch (InterruptedException ex) {
					}
				}
				if (!writer) {
					return;
				}
				j = writePointer;
				if (readPointer >= writePointer) {
					i = readPointer - writePointer;
				} else {
					i = 5000 - writePointer;
				}
			}
			if (i > 0) {
				try {
					outputstream.write(buffer, j, i);
				} catch (IOException _ex) {
					shutdown = true;
				}
				writePointer = (writePointer + i) % 5000;
				try {
					if (readPointer == writePointer) {
						outputstream.flush();
					}
				} catch (IOException ex) {
					shutdown = true;
				}
			}
		}
	}

	public void debug() {
		try {
			System.out.println("dummy:" + closed);
			System.out.println("tcycl:" + writePointer);
			System.out.println("tnum:" + readPointer);
			System.out.println("writer:" + writer);
			System.out.println("ioerror:" + shutdown);
			System.out.println("available:" + available());
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	/**
	 * Flushes the stream
	 * 
	 * @throws IOException
	 */
	public void flush() throws IOException {
		outputstream.flush();
	}

}