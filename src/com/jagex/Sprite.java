package com.jagex;
import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

import sign.signlink;

public class Sprite extends DrawingArea
{

    public int anInt1441;
    public boolean aBoolean1442;
    public int anInt1443;
    public int anInt1444;
    public int anInt1445;
    public byte aByte1446;
    public boolean aBoolean1447;
    public int pixel_array[];
    public int width;
    public int height;
    public int anInt1451;
    public int anInt1452;
    public int max_width;
    public int max_height;

    public Sprite(int width, int height)
    {
        aBoolean1442 = false;
        anInt1443 = 387;
        anInt1445 = 9;
        aByte1446 = 8;
        aBoolean1447 = true;
        pixel_array = new int[width * height];
        this.width = max_width = width;
        this.height = max_height = height;
        anInt1451 = anInt1452 = 0;
    }

    public Sprite(byte file[], Component component)
    {
        aBoolean1442 = false;
        anInt1443 = 387;
        anInt1445 = 9;
        aByte1446 = 8;
        aBoolean1447 = true;
        try
        {
            Image image = Toolkit.getDefaultToolkit().createImage(file);
            MediaTracker mediatracker = new MediaTracker(component);
            mediatracker.addImage(image, 0);
            mediatracker.waitForAll();
            width = image.getWidth(component);
            height = image.getHeight(component);
            max_width = width;
            max_height = height;
            anInt1451 = 0;
            anInt1452 = 0;
            pixel_array = new int[width * height];
            PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, width, height, pixel_array, 0, width);
            pixelgrabber.grabPixels();
            return;
        }
        catch(Exception _ex)
        {
            System.out.println("Error converting jpg");
        }
    }

    public Sprite(Archive class47, String s, int i)
    {
        aBoolean1442 = false;
        anInt1443 = 387;
        anInt1445 = 9;
        aByte1446 = 8;
        aBoolean1447 = true;
        Buffer class44_sub3_sub2 = new Buffer(class47.entry(s + ".dat", null));
        Buffer class44_sub3_sub2_1 = new Buffer(class47.entry("index.dat", null));
        class44_sub3_sub2_1.pointer = class44_sub3_sub2.getUnsignedShort();
        max_width = class44_sub3_sub2_1.getUnsignedShort();
        max_height = class44_sub3_sub2_1.getUnsignedShort();
        int j = class44_sub3_sub2_1.getUnsignedByte();
        int ai[] = new int[j];
        for(int k = 0; k < j - 1; k++)
        {
            ai[k + 1] = class44_sub3_sub2_1.getUnsignedTriByte();
            if(ai[k + 1] == 0)
            {
                ai[k + 1] = 1;
            }
        }
        for(int l = 0; l < i; l++)
        {
            class44_sub3_sub2_1.pointer += 2;
            class44_sub3_sub2.pointer += class44_sub3_sub2_1.getUnsignedShort() * class44_sub3_sub2_1.getUnsignedShort();
            class44_sub3_sub2_1.pointer++;
        }
        anInt1451 = class44_sub3_sub2_1.getUnsignedByte();
        anInt1452 = class44_sub3_sub2_1.getUnsignedByte();
        width = class44_sub3_sub2_1.getUnsignedShort();
        height = class44_sub3_sub2_1.getUnsignedShort();
        int i1 = class44_sub3_sub2_1.getUnsignedByte();
        int j1 = width * height;
        pixel_array = new int[j1];
        if(i1 == 0)
        {
            for(int k1 = 0; k1 < j1; k1++)
            {
                pixel_array[k1] = ai[class44_sub3_sub2.getUnsignedByte()];
            }
            return;
        }
        if(i1 == 1)
        {
            for(int l1 = 0; l1 < width; l1++)
            {
                for(int i2 = 0; i2 < height; i2++)
                {
                    pixel_array[l1 + i2 * width] = ai[class44_sub3_sub2.getUnsignedByte()];
                }
            }
        }
        
//        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
//        image.setRGB(0, 0, width, height, pixel_array, 0, width);
//        try{ImageIO.write(image, "png", new File("output/" + s + "_" + i + ".png"));}catch(Exception ex) {ex.printStackTrace();}
    }

    public void method435(byte byte0)
    {
        try
        {
            DrawingArea.method406(-78, pixel_array, width, height);
            if(byte0 == 5)
            {
                byte0 = 0;
                return;
            } else
            {
                anInt1441 = 4;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("24805, " + byte0 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method436(int i, byte byte0, int j, int k)
    {
        try
        {
            for(int l = 0; l < pixel_array.length; l++)
            {
                int i1 = pixel_array[l];
                if(i1 != 0)
                {
                    int j1 = i1 >> 16 & 0xff;
                    j1 += i;
                    if(j1 < 1)
                    {
                        j1 = 1;
                    } else
                    if(j1 > 255)
                    {
                        j1 = 255;
                    }
                    int k1 = i1 >> 8 & 0xff;
                    k1 += j;
                    if(k1 < 1)
                    {
                        k1 = 1;
                    } else
                    if(k1 > 255)
                    {
                        k1 = 255;
                    }
                    int l1 = i1 & 0xff;
                    l1 += k;
                    if(l1 < 1)
                    {
                        l1 = 1;
                    } else
                    if(l1 > 255)
                    {
                        l1 = 255;
                    }
                    pixel_array[l] = (j1 << 16) + (k1 << 8) + l1;
                }
            }
            if(byte0 == 3)
            {
                byte0 = 0;
                return;
            } else
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("40145, " + i + ", " + byte0 + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method437(int i)
    {
        try
        {
            int ai[] = new int[max_width * max_height];
            for(int j = 0; j < height; j++)
            {
                for(int k = 0; k < width; k++)
                {
                    ai[(j + anInt1452) * max_width + (k + anInt1451)] = pixel_array[j * width + k];
                }
            }
            pixel_array = ai;
            width = max_width;
            height = max_height;
            anInt1451 = 0;
            anInt1452 = 0;
            if(i != -15744)
            {
                aBoolean1442 = !aBoolean1442;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("30731, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method438(int i, int j, int k)
    {
        try
        {
            i += anInt1451;
            j += anInt1452;
            int l = i + j * DrawingArea.anInt1370;
            int i1 = 0;
            int j1 = height;
            int k1 = width;
            int l1 = DrawingArea.anInt1370 - k1;
            int i2 = 0;
            if(k != 8)
            {
                for(int j2 = 1; j2 > 0; j2++)
                {
                }
            }
            if(j < DrawingArea.anInt1372)
            {
                int k2 = DrawingArea.anInt1372 - j;
                j1 -= k2;
                j = DrawingArea.anInt1372;
                i1 += k2 * k1;
                l += k2 * DrawingArea.anInt1370;
            }
            if(j + j1 > DrawingArea.anInt1373)
            {
                j1 -= (j + j1) - DrawingArea.anInt1373;
            }
            if(i < DrawingArea.anInt1374)
            {
                int l2 = DrawingArea.anInt1374 - i;
                k1 -= l2;
                i = DrawingArea.anInt1374;
                i1 += l2;
                l += l2;
                i2 += l2;
                l1 += l2;
            }
            if(i + k1 > DrawingArea.anInt1375)
            {
                int i3 = (i + k1) - DrawingArea.anInt1375;
                k1 -= i3;
                i2 += i3;
                l1 += i3;
            }
            if(k1 <= 0 || j1 <= 0)
            {
                return;
            } else
            {
                method439(i1, DrawingArea.anIntArray1369, pixel_array, l, k1, j1, true, l1, i2);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("29381, " + i + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method439(int i, int ai[], int ai1[], int j, int k, int l, boolean flag,
            int i1, int j1)
    {
        try
        {
            int k1 = -(k >> 2);
            k = -(k & 3);
            if(!flag)
            {
                for(int l1 = 1; l1 > 0; l1++)
                {
                }
            }
            for(int i2 = -l; i2 < 0; i2++)
            {
                for(int j2 = k1; j2 < 0; j2++)
                {
                    ai[j++] = ai1[i++];
                    ai[j++] = ai1[i++];
                    ai[j++] = ai1[i++];
                    ai[j++] = ai1[i++];
                }
                for(int k2 = k; k2 < 0; k2++)
                {
                    ai[j++] = ai1[i++];
                }
                j += i1;
                i += j1;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("72719, " + i + ", " + ai + ", " + ai1 + ", " + j + ", " + k + ", " + l + ", " + flag + ", " + i1 + ", " + j1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void drawImage(int i, int j)
    {
        try
        {
            j += anInt1451;
            i += anInt1452;
            int k = j + i * DrawingArea.anInt1370;
            int l = 0;
            int i1 = height;
            int j1 = width;
            int k1 = DrawingArea.anInt1370 - j1;
            int l1 = 0;
            if(i < DrawingArea.anInt1372)
            {
                int i2 = DrawingArea.anInt1372 - i;
                i1 -= i2;
                i = DrawingArea.anInt1372;
                l += i2 * j1;
                k += i2 * DrawingArea.anInt1370;
            }
            if(i + i1 > DrawingArea.anInt1373)
            {
                i1 -= (i + i1) - DrawingArea.anInt1373;
            }
            if(j < DrawingArea.anInt1374)
            {
                int j2 = DrawingArea.anInt1374 - j;
                j1 -= j2;
                j = DrawingArea.anInt1374;
                l += j2;
                k += j2;
                l1 += j2;
                k1 += j2;
            }
            if(j + j1 > DrawingArea.anInt1375)
            {
                int k2 = (j + j1) - DrawingArea.anInt1375;
                j1 -= k2;
                l1 += k2;
                k1 += k2;
            }
            if(j1 <= 0 || i1 <= 0)
            {
                return;
            } else
            {
                method441(DrawingArea.anIntArray1369, pixel_array, 0, l, k, j1, i1, k1, l1);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("37524, " + i + ", " + 0 + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method441(int ai[], int ai1[], int i, int j, int k, int l, int i1,
            int j1, int k1)
    {
        int l1 = -(l >> 2);
        l = -(l & 3);
        for(int i2 = -i1; i2 < 0; i2++)
        {
            for(int j2 = l1; j2 < 0; j2++)
            {
                i = ai1[j++];
                if(i != 0)
                {
                    ai[k++] = i;
                } else
                {
                    k++;
                }
                i = ai1[j++];
                if(i != 0)
                {
                    ai[k++] = i;
                } else
                {
                    k++;
                }
                i = ai1[j++];
                if(i != 0)
                {
                    ai[k++] = i;
                } else
                {
                    k++;
                }
                i = ai1[j++];
                if(i != 0)
                {
                    ai[k++] = i;
                } else
                {
                    k++;
                }
            }
            for(int k2 = l; k2 < 0; k2++)
            {
                i = ai1[j++];
                if(i != 0)
                {
                    ai[k++] = i;
                } else
                {
                    k++;
                }
            }
            k += j1;
            j += k1;
        }
    }

    public void method442(int i, int j, int k, int l)
    {
        try
        {
            l += anInt1451;
            j = 15 / j;
            k += anInt1452;
            int i1 = l + k * DrawingArea.anInt1370;
            int j1 = 0;
            int k1 = height;
            int l1 = width;
            int i2 = DrawingArea.anInt1370 - l1;
            int j2 = 0;
            if(k < DrawingArea.anInt1372)
            {
                int k2 = DrawingArea.anInt1372 - k;
                k1 -= k2;
                k = DrawingArea.anInt1372;
                j1 += k2 * l1;
                i1 += k2 * DrawingArea.anInt1370;
            }
            if(k + k1 > DrawingArea.anInt1373)
            {
                k1 -= (k + k1) - DrawingArea.anInt1373;
            }
            if(l < DrawingArea.anInt1374)
            {
                int l2 = DrawingArea.anInt1374 - l;
                l1 -= l2;
                l = DrawingArea.anInt1374;
                j1 += l2;
                i1 += l2;
                j2 += l2;
                i2 += l2;
            }
            if(l + l1 > DrawingArea.anInt1375)
            {
                int i3 = (l + l1) - DrawingArea.anInt1375;
                l1 -= i3;
                j2 += i3;
                i2 += i3;
            }
            if(l1 <= 0 || k1 <= 0)
            {
                return;
            } else
            {
                method443(j1, i, i1, k1, DrawingArea.anIntArray1369, pixel_array, i2, j2, 0, l1, false);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("12746, " + i + ", " + j + ", " + k + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method443(int i, int j, int k, int l, int ai[], int ai1[], int i1,
            int j1, int k1, int l1, boolean flag)
    {
        try
        {
            if(flag)
            {
                return;
            }
            int i2 = 256 - j;
            for(int j2 = -l; j2 < 0; j2++)
            {
                for(int k2 = -l1; k2 < 0; k2++)
                {
                    k1 = ai1[i++];
                    if(k1 != 0)
                    {
                        int l2 = ai[k];
                        ai[k++] = ((k1 & 0xff00ff) * j + (l2 & 0xff00ff) * i2 & 0xff00ff00) + ((k1 & 0xff00) * j + (l2 & 0xff00) * i2 & 0xff0000) >> 8;
                    } else
                    {
                        k++;
                    }
                }
                k += i1;
                i += j1;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("94839, " + i + ", " + j + ", " + k + ", " + l + ", " + ai + ", " + ai1 + ", " + i1 + ", " + j1 + ", " + k1 + ", " + l1 + ", " + flag + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method444(int ai[], int i, int j, int k, int l, int i1, int ai1[],
            int j1, int k1, int l1, int i2)
    {
        try
        {
            while(k1 >= 0)
            {
                return;
            }
            try
            {
                int j2 = -j1 / 2;
                int k2 = -i1 / 2;
                int l2 = (int)(Math.sin((double)l / 326.11000000000001D) * 65536D);
                int i3 = (int)(Math.cos((double)l / 326.11000000000001D) * 65536D);
                l2 = l2 * k >> 8;
                i3 = i3 * k >> 8;
                int j3 = (l1 << 16) + (k2 * l2 + j2 * i3);
                int k3 = (j << 16) + (k2 * i3 - j2 * l2);
                int l3 = i2 + i * DrawingArea.anInt1370;
                for(i = 0; i < i1; i++)
                {
                    int i4 = ai[i];
                    int j4 = l3 + i4;
                    int k4 = j3 + i3 * i4;
                    int l4 = k3 - l2 * i4;
                    for(i2 = -ai1[i]; i2 < 0; i2++)
                    {
                        DrawingArea.anIntArray1369[j4++] = pixel_array[(k4 >> 16) + (l4 >> 16) * width];
                        k4 += i3;
                        l4 -= l2;
                    }
                    j3 += l2;
                    k3 += i3;
                    l3 += DrawingArea.anInt1370;
                }
                return;
            }
            catch(Exception _ex)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("82769, " + ai + ", " + i + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + ai1 + ", " + j1 + ", " + k1 + ", " + l1 + ", " + i2 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method445(int i, double d, int j, int k, int l, int i1,
            byte byte0, int j1, int k1)
    {
        try
        {
            if(byte0 == aByte1446)
            {
                byte0 = 0;
            } else
            {
                anInt1444 = -392;
            }
            try
            {
                int l1 = -j / 2;
                int i2 = -j1 / 2;
                int j2 = (int)(Math.sin(d) * 65536D);
                int k2 = (int)(Math.cos(d) * 65536D);
                j2 = j2 * k >> 8;
                k2 = k2 * k >> 8;
                int l2 = (i << 16) + (i2 * j2 + l1 * k2);
                int i3 = (l << 16) + (i2 * k2 - l1 * j2);
                int j3 = i1 + k1 * DrawingArea.anInt1370;
                for(k1 = 0; k1 < j1; k1++)
                {
                    int k3 = j3;
                    int l3 = l2;
                    int i4 = i3;
                    for(i1 = -j; i1 < 0; i1++)
                    {
                        int j4 = pixel_array[(l3 >> 16) + (i4 >> 16) * width];
                        if(j4 != 0)
                        {
                            DrawingArea.anIntArray1369[k3++] = j4;
                        } else
                        {
                            k3++;
                        }
                        l3 += k2;
                        i4 -= j2;
                    }
                    l2 += j2;
                    i3 += k2;
                    j3 += DrawingArea.anInt1370;
                }
                return;
            }
            catch(Exception _ex)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("35641, " + i + ", " + d + ", " + j + ", " + k + ", " + l + ", " + i1 + ", " + byte0 + ", " + j1 + ", " + k1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method446(int i, Class44_Sub3_Sub1_Sub3 class44_sub3_sub1_sub3, boolean flag, int j)
    {
        try
        {
            i += anInt1451;
            j += anInt1452;
            int k = i + j * DrawingArea.anInt1370;
            int l = 0;
            int i1 = height;
            int j1 = width;
            int k1 = DrawingArea.anInt1370 - j1;
            int l1 = 0;
            if(!flag)
            {
                aBoolean1447 = !aBoolean1447;
            }
            if(j < DrawingArea.anInt1372)
            {
                int i2 = DrawingArea.anInt1372 - j;
                i1 -= i2;
                j = DrawingArea.anInt1372;
                l += i2 * j1;
                k += i2 * DrawingArea.anInt1370;
            }
            if(j + i1 > DrawingArea.anInt1373)
            {
                i1 -= (j + i1) - DrawingArea.anInt1373;
            }
            if(i < DrawingArea.anInt1374)
            {
                int j2 = DrawingArea.anInt1374 - i;
                j1 -= j2;
                i = DrawingArea.anInt1374;
                l += j2;
                k += j2;
                l1 += j2;
                k1 += j2;
            }
            if(i + j1 > DrawingArea.anInt1375)
            {
                int k2 = (i + j1) - DrawingArea.anInt1375;
                j1 -= k2;
                l1 += k2;
                k1 += k2;
            }
            if(j1 <= 0 || i1 <= 0)
            {
                return;
            } else
            {
                method447(l, k, l1, class44_sub3_sub1_sub3.aByteArray1458, j1, k1, 0, i1, pixel_array, true, DrawingArea.anIntArray1369);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("46753, " + i + ", " + class44_sub3_sub1_sub3 + ", " + flag + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method447(int i, int j, int k, byte abyte0[], int l, int i1, int j1,
            int k1, int ai[], boolean flag, int ai1[])
    {
        try
        {
            if(!flag)
            {
                anInt1445 = 207;
            }
            int l1 = -(l >> 2);
            l = -(l & 3);
            for(int i2 = -k1; i2 < 0; i2++)
            {
                for(int j2 = l1; j2 < 0; j2++)
                {
                    j1 = ai[i++];
                    if(j1 != 0 && abyte0[j] == 0)
                    {
                        ai1[j++] = j1;
                    } else
                    {
                        j++;
                    }
                    j1 = ai[i++];
                    if(j1 != 0 && abyte0[j] == 0)
                    {
                        ai1[j++] = j1;
                    } else
                    {
                        j++;
                    }
                    j1 = ai[i++];
                    if(j1 != 0 && abyte0[j] == 0)
                    {
                        ai1[j++] = j1;
                    } else
                    {
                        j++;
                    }
                    j1 = ai[i++];
                    if(j1 != 0 && abyte0[j] == 0)
                    {
                        ai1[j++] = j1;
                    } else
                    {
                        j++;
                    }
                }
                for(int k2 = l; k2 < 0; k2++)
                {
                    j1 = ai[i++];
                    if(j1 != 0 && abyte0[j] == 0)
                    {
                        ai1[j++] = j1;
                    } else
                    {
                        j++;
                    }
                }
                j += i1;
                i += k;
            }
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("52031, " + i + ", " + j + ", " + k + ", " + abyte0 + ", " + l + ", " + i1 + ", " + j1 + ", " + k1 + ", " + ai + ", " + flag + ", " + ai1 + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }
}
