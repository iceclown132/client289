package com.jagex;


public class Tile
{

    public static int size;
    public static Tile tiles[];
    public String name;
    public int color_rgb;
    public int texture_id;
    public boolean aBoolean434;
    public boolean aBoolean435;
    public int hue;
    public int saturation;
    public int lightness;
    public int phase;
    public int amplitude;
    public int color_hsl;

	public static void method243(Archive archive) {
		Buffer buffer = new Buffer(archive.entry("flo.dat", null));
		size = buffer.getUnsignedShort();
		if (tiles == null) {
			tiles = new Tile[size];
		}
		for (int i = 0; i < size; i++) {
			if (tiles[i] == null) {
				tiles[i] = new Tile();
			}
			tiles[i].initialize(buffer);
		}
	}

	public void initialize(Buffer buffer) {
		do {
			int type = buffer.getUnsignedByte();
			if (type == 0) {
				return;
			}
			if (type == 1) {
				color_rgb = buffer.getUnsignedTriByte();
				rgb_to_hsl(color_rgb);
			} else if (type == 2) {
				texture_id = buffer.getUnsignedByte();
			} else if (type == 3) {
				aBoolean434 = true;
			} else if (type == 5) {
				aBoolean435 = false;
			} else if (type == 6) {
				name = buffer.getRSString();
			} else {
				System.out.println("Error unrecognised config code: " + type);
			}
		} while (true);
	}

	public void rgb_to_hsl(int rgb) {
		double red = (double) (rgb >> 16 & 0xff) / 256D;
		double green = (double) (rgb >> 8 & 0xff) / 256D;
		double blue = (double) (rgb & 0xff) / 256D;
		double min = red;
		
		if (green < min) {
			min = green;
		}
		if (blue < min) {
			min = blue;
		}
		double max = red;
		if (green > max) {
			max = green;
		}
		if (blue > max) {
			max = blue;
		}
		
		double h = 0.0D;
		double s = 0.0D;
		double l = (min + max) / 2D;
		if (min != max) {
			if (l < 0.5D) {
				s = (max - min) / (max + min);
			}
			if (l >= 0.5D) {
				s = (max - min) / (2D - max - min);
			}
			if (red == max) {
				h = (green - blue) / (max - min);
			} else if (green == max) {
				h = 2D + (blue - red) / (max - min);
			} else if (blue == max) {
				h = 4D + (red - green) / (max - min);
			}
		}
		h /= 6D;
		hue = (int) (h * 256D);
		saturation = (int) (s * 256D);
		lightness = (int) (l * 256D);
		if (saturation < 0) {
			saturation = 0;
		} else if (saturation > 255) {
			saturation = 255;
		}
		if (lightness < 0) {
			lightness = 0;
		} else if (lightness > 255) {
			lightness = 255;
		}
		if (l > 0.5D) {
			amplitude = (int) ((1.0D - l) * s * 512D);
		} else {
			amplitude = (int) (l * s * 512D);
		}
		if (amplitude < 1) {
			amplitude = 1;
		}
		phase = (int) (h * (double) amplitude);
		int j = (hue + (int) (Math.random() * 16D)) - 8;
		if (j < 0) {
			j = 0;
		} else if (j > 255) {
			j = 255;
		}
		int k = (saturation + (int) (Math.random() * 48D)) - 24;
		if (k < 0) {
			k = 0;
		} else if (k > 255) {
			k = 255;
		}
		int l_e = (lightness + (int) (Math.random() * 48D)) - 24;
		if (l_e < 0) {
			l_e = 0;
		} else if (l_e > 255) {
			l_e = 255;
		}
		color_hsl = get_hsl(hue, saturation, lightness);
	}

	public int get_hsl(int hue, int saturation, int lightness) {
		if (lightness > 179) {
			saturation /= 2;
		}
		if (lightness > 192) {
			saturation /= 2;
		}
		if (lightness > 217) {
			saturation /= 2;
		}
		if (lightness > 243) {
			saturation /= 2;
		}
		return (hue / 4 << 10) + (saturation / 32 << 7) + lightness / 2;
	}

	public Tile() {
		texture_id = -1;
		aBoolean435 = true;
	}

}
