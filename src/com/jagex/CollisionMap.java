package com.jagex;
import sign.signlink;

public class CollisionMap
{

    public int anInt405;
    public boolean aBoolean406;
    public int anInt407;
    public int anInt408;
    public int anInt409;
    public byte aByte410;
    public boolean aBoolean411;
    public int anInt412;
    public boolean aBoolean413;
    public int offset_x;
    public int offset_y;
    public int map_width;
    public int map_height;
    public int collision_flags[][];

	public CollisionMap(int width, int height) {
		anInt405 = -550;
		aBoolean406 = false;
		anInt408 = 8;
		anInt409 = 70;
		aByte410 = 99;
		aBoolean411 = true;
		anInt412 = 1;
		aBoolean413 = true;
		offset_x = 0;
		offset_y = 0;
		map_width = width;
		map_height = height;
		collision_flags = new int[map_width][map_height];
		method231();
	}

	public void method231() {
		for (int x = 0; x < map_width; x++) {
			for (int y = 0; y < map_height; y++) {
				if (x == 0 || y == 0 || x == map_width - 1 || y == map_height - 1) {
					collision_flags[x][y] = 0xffffff;
				} else {
					collision_flags[x][y] = 0;
				}
			}
		}

	}

	public void method232(boolean flag, int orientation, boolean flag1, int type, int x, int y) {
		x -= offset_x;
		y -= offset_y;
		if (!flag) {
			anInt409 = -69;
		}
		if (type == 0) {
			if (orientation == 0) {
				add_collision_flag(x, y, 128);
				add_collision_flag(x - 1, y, 8);
			}
			if (orientation == 1) {
				add_collision_flag(x, y, 2);
				add_collision_flag(x, y + 1, 32);
			}
			if (orientation == 2) {
				add_collision_flag(x, y, 8);
				add_collision_flag(x + 1, y, 128);
			}
			if (orientation == 3) {
				add_collision_flag(x, y, 32);
				add_collision_flag(x, y - 1, 2);
			}
		}
		if (type == 1 || type == 3) {
			if (orientation == 0) {
				add_collision_flag(x, y, 1);
				add_collision_flag(x - 1, y + 1, 16);
			}
			if (orientation == 1) {
				add_collision_flag(x, y, 4);
				add_collision_flag(x + 1, y + 1, 64);
			}
			if (orientation == 2) {
				add_collision_flag(x, y, 16);
				add_collision_flag(x + 1, y - 1, 1);
			}
			if (orientation == 3) {
				add_collision_flag(x, y, 64);
				add_collision_flag(x - 1, y - 1, 4);
			}
		}
		if (type == 2) {
			if (orientation == 0) {
				add_collision_flag(x, y, 130);
				add_collision_flag(x - 1, y, 8);
				add_collision_flag(x, y + 1, 32);
			}
			if (orientation == 1) {
				add_collision_flag(x, y, 10);
				add_collision_flag(x, y + 1, 32);
				add_collision_flag(x + 1, y, 128);
			}
			if (orientation == 2) {
				add_collision_flag(x, y, 40);
				add_collision_flag(x + 1, y, 128);
				add_collision_flag(x, y - 1, 2);
			}
			if (orientation == 3) {
				add_collision_flag(x, y, 160);
				add_collision_flag(x, y - 1, 2);
				add_collision_flag(x - 1, y, 8);
			}
		}
		if (flag1) {
			if (type == 0) {
				if (orientation == 0) {
					add_collision_flag(x, y, 0x10000);
					add_collision_flag(x - 1, y, 4096);
				}
				if (orientation == 1) {
					add_collision_flag(x, y, 1024);
					add_collision_flag(x, y + 1, 16384);
				}
				if (orientation == 2) {
					add_collision_flag(x, y, 4096);
					add_collision_flag(x + 1, y, 0x10000);
				}
				if (orientation == 3) {
					add_collision_flag(x, y, 16384);
					add_collision_flag(x, y - 1, 1024);
				}
			}
			if (type == 1 || type == 3) {
				if (orientation == 0) {
					add_collision_flag(x, y, 512);
					add_collision_flag(x - 1, y + 1, 8192);
				}
				if (orientation == 1) {
					add_collision_flag(x, y, 2048);
					add_collision_flag(x + 1, y + 1, 32768);
				}
				if (orientation == 2) {
					add_collision_flag(x, y, 8192);
					add_collision_flag(x + 1, y - 1, 512);
				}
				if (orientation == 3) {
					add_collision_flag(x, y, 32768);
					add_collision_flag(x - 1, y - 1, 2048);
				}
			}
			if (type == 2) {
				if (orientation == 0) {
					add_collision_flag(x, y, 0x10400);
					add_collision_flag(x - 1, y, 4096);
					add_collision_flag(x, y + 1, 16384);
				}
				if (orientation == 1) {
					add_collision_flag(x, y, 5120);
					add_collision_flag(x, y + 1, 16384);
					add_collision_flag(x + 1, y, 0x10000);
				}
				if (orientation == 2) {
					add_collision_flag(x, y, 20480);
					add_collision_flag(x + 1, y, 0x10000);
					add_collision_flag(x, y - 1, 1024);
				}
				if (orientation == 3) {
					add_collision_flag(x, y, 0x14000);
					add_collision_flag(x, y - 1, 1024);
					add_collision_flag(x - 1, y, 4096);
					return;
				}
			}
		}
	}

	public void set_object_collision(int y, int object_width, boolean flag, int x, int object_height, int orientation) {
		int collision_flag = 256;
		if (flag) {
			collision_flag += 0x20000;
		}
		
		x -= offset_x;
		y -= offset_y;
		
		if (orientation == 1 || orientation == 3) {
			int temp = object_width;
			object_width = object_height;
			object_height = temp;
		}
		
		for (int tile_x = x; tile_x < x + object_width; tile_x++) {
			if (tile_x >= 0 && tile_x < map_width) {
				for (int tile_y = y; tile_y < y + object_height; tile_y++) {
					if (tile_y >= 0 && tile_y < map_height) {
						add_collision_flag(tile_x, tile_y, collision_flag);
					}
				}
			}
		}
	}

	public void method234(int x, int y) {
		x -= offset_x;
		y -= offset_y;
		collision_flags[x][y] |= 0x200000;
	}

	public void add_collision_flag(int x, int y, int flag) {
		collision_flags[x][y] |= flag;
	}

    public void method236(int i, int j, int k, int l, boolean flag, byte byte0)
    {
        try
        {
            l -= offset_x;
            if(byte0 != 3)
            {
                for(int i1 = 1; i1 > 0; i1++)
                {
                }
            }
            k -= offset_y;
            if(j == 0)
            {
                if(i == 0)
                {
                    method238(l, k, 128);
                    method238(l - 1, k, 8);
                }
                if(i == 1)
                {
                    method238(l, k, 2);
                    method238(l, k + 1, 32);
                }
                if(i == 2)
                {
                    method238(l, k, 8);
                    method238(l + 1, k, 128);
                }
                if(i == 3)
                {
                    method238(l, k, 32);
                    method238(l, k - 1, 2);
                }
            }
            if(j == 1 || j == 3)
            {
                if(i == 0)
                {
                    method238(l, k, 1);
                    method238(l - 1, k + 1, 16);
                }
                if(i == 1)
                {
                    method238(l, k, 4);
                    method238(l + 1, k + 1, 64);
                }
                if(i == 2)
                {
                    method238(l, k, 16);
                    method238(l + 1, k - 1, 1);
                }
                if(i == 3)
                {
                    method238(l, k, 64);
                    method238(l - 1, k - 1, 4);
                }
            }
            if(j == 2)
            {
                if(i == 0)
                {
                    method238(l, k, 130);
                    method238(l - 1, k, 8);
                    method238(l, k + 1, 32);
                }
                if(i == 1)
                {
                    method238(l, k, 10);
                    method238(l, k + 1, 32);
                    method238(l + 1, k, 128);
                }
                if(i == 2)
                {
                    method238(l, k, 40);
                    method238(l + 1, k, 128);
                    method238(l, k - 1, 2);
                }
                if(i == 3)
                {
                    method238(l, k, 160);
                    method238(l, k - 1, 2);
                    method238(l - 1, k, 8);
                }
            }
            if(flag)
            {
                if(j == 0)
                {
                    if(i == 0)
                    {
                        method238(l, k, 0x10000);
                        method238(l - 1, k, 4096);
                    }
                    if(i == 1)
                    {
                        method238(l, k, 1024);
                        method238(l, k + 1, 16384);
                    }
                    if(i == 2)
                    {
                        method238(l, k, 4096);
                        method238(l + 1, k, 0x10000);
                    }
                    if(i == 3)
                    {
                        method238(l, k, 16384);
                        method238(l, k - 1, 1024);
                    }
                }
                if(j == 1 || j == 3)
                {
                    if(i == 0)
                    {
                        method238(l, k, 512);
                        method238(l - 1, k + 1, 8192);
                    }
                    if(i == 1)
                    {
                        method238(l, k, 2048);
                        method238(l + 1, k + 1, 32768);
                    }
                    if(i == 2)
                    {
                        method238(l, k, 8192);
                        method238(l + 1, k - 1, 512);
                    }
                    if(i == 3)
                    {
                        method238(l, k, 32768);
                        method238(l - 1, k - 1, 2048);
                    }
                }
                if(j == 2)
                {
                    if(i == 0)
                    {
                        method238(l, k, 0x10400);
                        method238(l - 1, k, 4096);
                        method238(l, k + 1, 16384);
                    }
                    if(i == 1)
                    {
                        method238(l, k, 5120);
                        method238(l, k + 1, 16384);
                        method238(l + 1, k, 0x10000);
                    }
                    if(i == 2)
                    {
                        method238(l, k, 20480);
                        method238(l + 1, k, 0x10000);
                        method238(l, k - 1, 1024);
                    }
                    if(i == 3)
                    {
                        method238(l, k, 0x14000);
                        method238(l, k - 1, 1024);
                        method238(l - 1, k, 4096);
                        return;
                    }
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("35289, " + i + ", " + j + ", " + k + ", " + l + ", " + flag + ", " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method237(int i, int j, int k, boolean flag, int l, int i1, int j1)
    {
        try
        {
            int k1 = 256;
            if(flag)
            {
                k1 += 0x20000;
            }
            k -= offset_x;
            j -= offset_y;
            if(l != 8)
            {
                return;
            }
            if(i1 == 1 || i1 == 3)
            {
                int l1 = j1;
                j1 = i;
                i = l1;
            }
            for(int x = k; x < k + j1; x++)
            {
                if(x >= 0 && x < map_width)
                {
                    for(int y = j; y < j + i; y++)
                    {
                        if(y >= 0 && y < map_height)
                        {
                            method238(x, y, k1);
                        }
                    }
                }
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("63255, " + i + ", " + j + ", " + k + ", " + flag + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

	public void method238(int x, int y, int l) {
		collision_flags[x][y] &= 0xffffff - l;
	}

    public void method239(int i, boolean flag, int j)
    {
        try
        {
            if(!flag)
            {
                return;
            } else
            {
                j -= offset_x;
                i -= offset_y;
                collision_flags[j][i] &= 0xdfffff;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("56700, " + i + ", " + flag + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method240(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        try
        {
            if(j1 == l && i1 == i)
            {
                return true;
            }
            j1 -= offset_x;
            i1 -= offset_y;
            l -= offset_x;
            i -= offset_y;
            if(k1 >= 0)
            {
                aBoolean406 = !aBoolean406;
            }
            if(k == 0)
            {
                if(j == 0)
                {
                    if(j1 == l - 1 && i1 == i)
                    {
                        return true;
                    }
                    if(j1 == l && i1 == i + 1 && (collision_flags[j1][i1] & 0x280120) == 0)
                    {
                        return true;
                    }
                    if(j1 == l && i1 == i - 1 && (collision_flags[j1][i1] & 0x280102) == 0)
                    {
                        return true;
                    }
                } else
                if(j == 1)
                {
                    if(j1 == l && i1 == i + 1)
                    {
                        return true;
                    }
                    if(j1 == l - 1 && i1 == i && (collision_flags[j1][i1] & 0x280108) == 0)
                    {
                        return true;
                    }
                    if(j1 == l + 1 && i1 == i && (collision_flags[j1][i1] & 0x280180) == 0)
                    {
                        return true;
                    }
                } else
                if(j == 2)
                {
                    if(j1 == l + 1 && i1 == i)
                    {
                        return true;
                    }
                    if(j1 == l && i1 == i + 1 && (collision_flags[j1][i1] & 0x280120) == 0)
                    {
                        return true;
                    }
                    if(j1 == l && i1 == i - 1 && (collision_flags[j1][i1] & 0x280102) == 0)
                    {
                        return true;
                    }
                } else
                if(j == 3)
                {
                    if(j1 == l && i1 == i - 1)
                    {
                        return true;
                    }
                    if(j1 == l - 1 && i1 == i && (collision_flags[j1][i1] & 0x280108) == 0)
                    {
                        return true;
                    }
                    if(j1 == l + 1 && i1 == i && (collision_flags[j1][i1] & 0x280180) == 0)
                    {
                        return true;
                    }
                }
            }
            if(k == 2)
            {
                if(j == 0)
                {
                    if(j1 == l - 1 && i1 == i)
                    {
                        return true;
                    }
                    if(j1 == l && i1 == i + 1)
                    {
                        return true;
                    }
                    if(j1 == l + 1 && i1 == i && (collision_flags[j1][i1] & 0x280180) == 0)
                    {
                        return true;
                    }
                    if(j1 == l && i1 == i - 1 && (collision_flags[j1][i1] & 0x280102) == 0)
                    {
                        return true;
                    }
                } else
                if(j == 1)
                {
                    if(j1 == l - 1 && i1 == i && (collision_flags[j1][i1] & 0x280108) == 0)
                    {
                        return true;
                    }
                    if(j1 == l && i1 == i + 1)
                    {
                        return true;
                    }
                    if(j1 == l + 1 && i1 == i)
                    {
                        return true;
                    }
                    if(j1 == l && i1 == i - 1 && (collision_flags[j1][i1] & 0x280102) == 0)
                    {
                        return true;
                    }
                } else
                if(j == 2)
                {
                    if(j1 == l - 1 && i1 == i && (collision_flags[j1][i1] & 0x280108) == 0)
                    {
                        return true;
                    }
                    if(j1 == l && i1 == i + 1 && (collision_flags[j1][i1] & 0x280120) == 0)
                    {
                        return true;
                    }
                    if(j1 == l + 1 && i1 == i)
                    {
                        return true;
                    }
                    if(j1 == l && i1 == i - 1)
                    {
                        return true;
                    }
                } else
                if(j == 3)
                {
                    if(j1 == l - 1 && i1 == i)
                    {
                        return true;
                    }
                    if(j1 == l && i1 == i + 1 && (collision_flags[j1][i1] & 0x280120) == 0)
                    {
                        return true;
                    }
                    if(j1 == l + 1 && i1 == i && (collision_flags[j1][i1] & 0x280180) == 0)
                    {
                        return true;
                    }
                    if(j1 == l && i1 == i - 1)
                    {
                        return true;
                    }
                }
            }
            if(k == 9)
            {
                if(j1 == l && i1 == i + 1 && (collision_flags[j1][i1] & 0x20) == 0)
                {
                    return true;
                }
                if(j1 == l && i1 == i - 1 && (collision_flags[j1][i1] & 2) == 0)
                {
                    return true;
                }
                if(j1 == l - 1 && i1 == i && (collision_flags[j1][i1] & 8) == 0)
                {
                    return true;
                }
                if(j1 == l + 1 && i1 == i && (collision_flags[j1][i1] & 0x80) == 0)
                {
                    return true;
                }
            }
            return false;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("58304, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method241(byte byte0, int i, int j, int k, int l, int i1, int j1)
    {
        try
        {
            if(j1 == i && j == k)
            {
                return true;
            }
            j1 -= offset_x;
            if(byte0 != -58)
            {
                anInt408 = 54;
            }
            j -= offset_y;
            i -= offset_x;
            k -= offset_y;
            if(l == 6 || l == 7)
            {
                if(l == 7)
                {
                    i1 = i1 + 2 & 3;
                }
                if(i1 == 0)
                {
                    if(j1 == i + 1 && j == k && (collision_flags[j1][j] & 0x80) == 0)
                    {
                        return true;
                    }
                    if(j1 == i && j == k - 1 && (collision_flags[j1][j] & 2) == 0)
                    {
                        return true;
                    }
                } else
                if(i1 == 1)
                {
                    if(j1 == i - 1 && j == k && (collision_flags[j1][j] & 8) == 0)
                    {
                        return true;
                    }
                    if(j1 == i && j == k - 1 && (collision_flags[j1][j] & 2) == 0)
                    {
                        return true;
                    }
                } else
                if(i1 == 2)
                {
                    if(j1 == i - 1 && j == k && (collision_flags[j1][j] & 8) == 0)
                    {
                        return true;
                    }
                    if(j1 == i && j == k + 1 && (collision_flags[j1][j] & 0x20) == 0)
                    {
                        return true;
                    }
                } else
                if(i1 == 3)
                {
                    if(j1 == i + 1 && j == k && (collision_flags[j1][j] & 0x80) == 0)
                    {
                        return true;
                    }
                    if(j1 == i && j == k + 1 && (collision_flags[j1][j] & 0x20) == 0)
                    {
                        return true;
                    }
                }
            }
            if(l == 8)
            {
                if(j1 == i && j == k + 1 && (collision_flags[j1][j] & 0x20) == 0)
                {
                    return true;
                }
                if(j1 == i && j == k - 1 && (collision_flags[j1][j] & 2) == 0)
                {
                    return true;
                }
                if(j1 == i - 1 && j == k && (collision_flags[j1][j] & 8) == 0)
                {
                    return true;
                }
                if(j1 == i + 1 && j == k && (collision_flags[j1][j] & 0x80) == 0)
                {
                    return true;
                }
            }
            return false;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("39211, " + byte0 + ", " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method242(int i, int j, int k, int l, int i1, int j1, int k1,
            int l1)
    {
        try
        {
            int i2 = (l1 + i) - 1;
            int j2 = (j + i1) - 1;
            if(l < anInt412 || l > anInt412)
            {
                anInt407 = 337;
            }
            if(j1 >= l1 && j1 <= i2 && k >= j && k <= j2)
            {
                return true;
            }
            if(j1 == l1 - 1 && k >= j && k <= j2 && (collision_flags[j1 - offset_x][k - offset_y] & 8) == 0 && (k1 & 8) == 0)
            {
                return true;
            }
            if(j1 == i2 + 1 && k >= j && k <= j2 && (collision_flags[j1 - offset_x][k - offset_y] & 0x80) == 0 && (k1 & 2) == 0)
            {
                return true;
            }
            if(k == j - 1 && j1 >= l1 && j1 <= i2 && (collision_flags[j1 - offset_x][k - offset_y] & 2) == 0 && (k1 & 4) == 0)
            {
                return true;
            }
            return k == j2 + 1 && j1 >= l1 && j1 <= i2 && (collision_flags[j1 - offset_x][k - offset_y] & 0x20) == 0 && (k1 & 1) == 0;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("55272, " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + l1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }
}
