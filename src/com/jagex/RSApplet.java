package com.jagex;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import sign.signlink;

@SuppressWarnings("serial")
public class RSApplet extends Applet
    implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener
{

    public boolean aBoolean1;
    public int anInt2;
    public int anInt3;
    public int anInt4;
    public int anInt5;
    public int anInt6;
    public int anInt7;
    public long aLongArray8[];
    public int anInt9;
    public boolean aBoolean10;
    public int anInt11;
    public int anInt12;
    public Graphics graphics;
    public Class34 aClass34_14;
    public Sprite aClass44_Sub3_Sub1_Sub2Array15[];
    public Frame_Sub1 aFrame_Sub1_16;
    public boolean aBoolean17;
    public boolean aBoolean18;
    public int anInt19;
    public int anInt20;
    public int mouse_x;
    public int mouse_y;
    public int anInt23;
    public int anInt24;
    public int anInt25;
    public long aLong26;
    public int anInt27;
    public int anInt28;
    public int anInt29;
    public long aLong30;
    public int player_configuration[];
    public int anIntArray32[];
    public int anInt33;
    public int anInt34;
    public static boolean aBoolean35;

    public void method1(int i, int j, int k)
    {
        try
        {
            anInt11 = j;
            anInt12 = i;
            aFrame_Sub1_16 = new Frame_Sub1(anInt12, 27016, anInt11, this);
            graphics = method11(7).getGraphics();
            if(k != 0)
            {
                anInt4 = -480;
            }
            aClass34_14 = new Class34(method11(7), anInt11, anInt12, 2);
            submit(this, 1);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("84735, " + i + ", " + j + ", " + k + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method2(boolean flag, int i, int j)
    {
        try
        {
            anInt11 = i;
            if(!flag)
            {
                anInt3 = 4;
            }
            anInt12 = j;
            graphics = method11(7).getGraphics();
            aClass34_14 = new Class34(method11(7), anInt11, anInt12, 2);
            submit(this, 1);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("72806, " + flag + ", " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void run()
    {
        method11(7).addMouseListener(this);
        method11(7).addMouseMotionListener(this);
        method11(7).addKeyListener(this);
        method11(7).addFocusListener(this);
        if(aFrame_Sub1_16 != null)
        {
            aFrame_Sub1_16.addWindowListener(this);
        }
        method13(false, 0, "Loading...");
        method6();
        int i = 0;
        int j = 256;
        int k = 1;
        int i1 = 0;
        int j1 = 0;
        for(int k1 = 0; k1 < 10; k1++)
        {
            aLongArray8[k1] = System.currentTimeMillis();
        }
        while(anInt5 >= 0)
        {
            if(anInt5 > 0)
            {
                anInt5--;
                if(anInt5 == 0)
                {
                    method3(0);
                    return;
                }
            }
            int i2 = j;
            int j2 = k;
            j = 300;
            k = 1;
            long l1 = System.currentTimeMillis();
            if(aLongArray8[i] == 0L)
            {
                j = i2;
                k = j2;
            } else
            if(l1 > aLongArray8[i])
            {
                j = (int)((long)(2560 * anInt6) / (l1 - aLongArray8[i]));
            }
            if(j < 25)
            {
                j = 25;
            }
            if(j > 256)
            {
                j = 256;
                k = (int)((long)anInt6 - (l1 - aLongArray8[i]) / 10L);
            }
            if(k > anInt6)
            {
                k = anInt6;
            }
            aLongArray8[i] = l1;
            i = (i + 1) % 10;
            if(k > 1)
            {
                for(int k2 = 0; k2 < 10; k2++)
                {
                    if(aLongArray8[k2] != 0L)
                    {
                        aLongArray8[k2] += k;
                    }
                }
            }
            if(k < anInt7)
            {
                k = anInt7;
            }
            try
            {
                Thread.sleep(k);
            }
            catch(InterruptedException _ex)
            {
                j1++;
            }
            for(; i1 < 256; i1 += j)
            {
                anInt27 = anInt23;
                anInt28 = anInt24;
                anInt29 = anInt25;
                aLong30 = aLong26;
                anInt23 = 0;
                method7(9);
                anInt33 = anInt34;
            }
            i1 &= 0xff;
            if(anInt6 > 0)
            {
                anInt9 = (1000 * j) / (anInt6 * 256);
            }
            method9((byte)1);
            if(aBoolean10)
            {
                System.out.println("ntime:" + l1);
                for(int l2 = 0; l2 < 10; l2++)
                {
                    int i3 = ((i - l2 - 1) + 20) % 10;
                    System.out.println("otim" + i3 + ":" + aLongArray8[i3]);
                }
                System.out.println("fps:" + anInt9 + " ratio:" + j + " count:" + i1);
                System.out.println("del:" + k + " deltime:" + anInt6 + " mindel:" + anInt7);
                System.out.println("intex:" + j1 + " opos:" + i);
                aBoolean10 = false;
                j1 = 0;
            }
        }
        if(anInt5 == -1)
        {
            method3(0);
        }
    }

    public void method3(int i)
    {
        try
        {
            anInt5 = -2;
            logout(874);
            if(i != 0)
            {
                return;
            }
            if(aFrame_Sub1_16 != null)
            {
                try
                {
                    Thread.sleep(1000L);
                }
                catch(Exception _ex)
                {
                }
                try
                {
                    System.exit(0);
                    return;
                }
                catch(Throwable _ex)
                {
                    return;
                }
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("66676, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method4(int i, int j)
    {
        try
        {
            if(j <= 0)
            {
                return;
            } else
            {
                anInt6 = 1000 / i;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("19917, " + i + ", " + j + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void start()
    {
        if(anInt5 >= 0)
        {
            anInt5 = 0;
        }
    }

    public void stop()
    {
        if(anInt5 >= 0)
        {
            anInt5 = 4000 / anInt6;
        }
    }

    public void destroy()
    {
        anInt5 = -1;
        try
        {
            Thread.sleep(5000L);
        }
        catch(Exception _ex)
        {
        }
        if(anInt5 == -1)
        {
            method3(0);
        }
    }

    public void update(Graphics g)
    {
        if(graphics == null)
        {
            graphics = g;
        }
        aBoolean17 = true;
        method10(false);
    }

    public void paint(Graphics g)
    {
        if(graphics == null)
        {
            graphics = g;
        }
        aBoolean17 = true;
        method10(false);
    }

    public void mousePressed(MouseEvent mouseevent)
    {
        int i = mouseevent.getX();
        int j = mouseevent.getY();
        if(aFrame_Sub1_16 != null)
        {
            i -= 4;
            j -= 22;
        }
        anInt19 = 0;
        anInt24 = i;
        anInt25 = j;
        aLong26 = System.currentTimeMillis();
        if(mouseevent.isMetaDown())
        {
            anInt23 = 2;
            anInt20 = 2;
            return;
        } else
        {
            anInt23 = 1;
            anInt20 = 1;
            return;
        }
    }

    public void mouseReleased(MouseEvent mouseevent)
    {
        anInt19 = 0;
        anInt20 = 0;
    }

    public void mouseClicked(MouseEvent mouseevent)
    {
    }

    public void mouseEntered(MouseEvent mouseevent)
    {
    }

    public void mouseExited(MouseEvent mouseevent)
    {
        anInt19 = 0;
        mouse_x = -1;
        mouse_y = -1;
    }

    public void mouseDragged(MouseEvent mouseevent)
    {
        int i = mouseevent.getX();
        int j = mouseevent.getY();
        if(aFrame_Sub1_16 != null)
        {
            i -= 4;
            j -= 22;
        }
        anInt19 = 0;
        mouse_x = i;
        mouse_y = j;
    }

    public void mouseMoved(MouseEvent mouseevent)
    {
        int i = mouseevent.getX();
        int j = mouseevent.getY();
        if(aFrame_Sub1_16 != null)
        {
            i -= 4;
            j -= 22;
        }
        anInt19 = 0;
        mouse_x = i;
        mouse_y = j;
    }

    public void keyPressed(KeyEvent keyevent)
    {
        anInt19 = 0;
        int key_pressed = keyevent.getKeyCode();
        int key_code = keyevent.getKeyChar();
        if(key_code < 30)
        {
            key_code = 0;
        }
        if(key_pressed == 37)
        {
            key_code = 1;
        }
        if(key_pressed == 39)
        {
            key_code = 2;
        }
        if(key_pressed == 38)
        {
            key_code = 3;
        }
        if(key_pressed == 40)
        {
            key_code = 4;
        }
        if(key_pressed == 17)
        {
            key_code = 5;
        }
        if(key_pressed == 8)
        {
            key_code = 8;
        }
        if(key_pressed == 127)
        {
            key_code = 8;
        }
        if(key_pressed == 9)
        {
            key_code = 9;
        }
        if(key_pressed == 10) // enter
        {
            key_code = 10;
        }
        if(key_pressed >= 112 && key_pressed <= 123)
        {
            key_code = (1008 + key_pressed) - 112;
        }
        if(key_pressed == 36)
        {
            key_code = 1000;
        }
        if(key_pressed == 35)
        {
            key_code = 1001;
        }
        if(key_pressed == 33)
        {
            key_code = 1002;
        }
        if(key_pressed == 34)
        {
            key_code = 1003;
        }
        if(key_code > 0 && key_code < 128)
        {
            player_configuration[key_code] = 1;
        }
        if(key_code > 4)
        {
            anIntArray32[anInt34] = key_code;
            anInt34 = anInt34 + 1 & 0x7f;
        }
    }

    public void keyReleased(KeyEvent keyevent)
    {
        anInt19 = 0;
        int i = keyevent.getKeyCode();
        char c = keyevent.getKeyChar();
        if(c < '\036')
        {
            c = '\0';
        }
        if(i == 37)
        {
            c = '\001';
        }
        if(i == 39)
        {
            c = '\002';
        }
        if(i == 38)
        {
            c = '\003';
        }
        if(i == 40)
        {
            c = '\004';
        }
        if(i == 17)
        {
            c = '\005';
        }
        if(i == 8)
        {
            c = '\b';
        }
        if(i == 127)
        {
            c = '\b';
        }
        if(i == 9)
        {
            c = '\t';
        }
        if(i == 10)
        {
            c = '\n';
        }
        if(c > 0 && c < '\200')
        {
            player_configuration[c] = 0;
        }
    }

    public void keyTyped(KeyEvent keyevent)
    {
    }

    public int method5(int i)
    {
        try
        {
            int j = -1;
            if(i >= 0)
            {
                aBoolean1 = !aBoolean1;
            }
            if(anInt34 != anInt33)
            {
                j = anIntArray32[anInt33];
                anInt33 = anInt33 + 1 & 0x7f;
            }
            return j;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("9078, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void focusGained(FocusEvent focusevent)
    {
        aBoolean18 = true;
        aBoolean17 = true;
        method10(false);
    }

    public void focusLost(FocusEvent focusevent)
    {
        aBoolean18 = false;
        for(int i = 0; i < 128; i++)
        {
            player_configuration[i] = 0;
        }
    }

    public void windowActivated(WindowEvent windowevent)
    {
    }

    public void windowClosed(WindowEvent windowevent)
    {
    }

    public void windowClosing(WindowEvent windowevent)
    {
        destroy();
    }

    public void windowDeactivated(WindowEvent windowevent)
    {
    }

    public void windowDeiconified(WindowEvent windowevent)
    {
    }

    public void windowIconified(WindowEvent windowevent)
    {
    }

    public void windowOpened(WindowEvent windowevent)
    {
    }

    public void method6()
    {
    }

    public void method7(int i)
    {
        try
        {
            if(i != 9)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("72813, " + i + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void logout(int i)
    {
        try
        {
            i = 38 / i;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("23302, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method9(byte byte0)
    {
        try
        {
            if(byte0 != 1)
            {
                aBoolean1 = !aBoolean1;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("64489, " + byte0 + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void method10(boolean flag)
    {
        try
        {
            if(flag)
            {
                anInt3 = 244;
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("4586, " + flag + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public Component method11(int i)
    {
        try
        {
            if(i != 7)
            {
                throw new NullPointerException();
            }
            if(aFrame_Sub1_16 != null)
            {
                return aFrame_Sub1_16;
            } else
            {
                return this;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("96176, " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void submit(Runnable runnable, int i)
    {
        Thread thread = new Thread(runnable);
        thread.start();
        thread.setPriority(i);
    }

    public void method13(boolean flag, int i, String s)
    {
        try
        {
            while(graphics == null)
            {
                graphics = method11(7).getGraphics();
                try
                {
                    method11(7).repaint();
                }
                catch(Exception _ex)
                {
                }
                try
                {
                    Thread.sleep(1000L);
                }
                catch(Exception _ex)
                {
                }
            }
            Font font = new Font("Helvetica", 1, 13);
            FontMetrics fontmetrics = method11(7).getFontMetrics(font);
            Font font1 = new Font("Helvetica", 0, 13);
            method11(7).getFontMetrics(font1);
            if(aBoolean17)
            {
                graphics.setColor(Color.black);
                graphics.fillRect(0, 0, anInt11, anInt12);
                aBoolean17 = false;
            }
            Color color = new Color(140, 17, 17);
            int j = anInt12 / 2 - 18;
            graphics.setColor(color);
            graphics.drawRect(anInt11 / 2 - 152, j, 304, 34);
            graphics.fillRect(anInt11 / 2 - 150, j + 2, i * 3, 30);
            graphics.setColor(Color.black);
            graphics.fillRect((anInt11 / 2 - 150) + i * 3, j + 2, 300 - i * 3, 30);
            graphics.setFont(font);
            graphics.setColor(Color.white);
            graphics.drawString(s, (anInt11 - fontmetrics.stringWidth(s)) / 2, j + 22);
            if(flag)
            {
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("88163, " + flag + ", " + i + ", " + s + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public RSApplet()
    {
        aBoolean1 = false;
        anInt2 = -128;
        anInt3 = 37395;
        anInt4 = -6002;
        anInt6 = 20;
        anInt7 = 1;
        aLongArray8 = new long[10];
        aBoolean10 = false;
        aClass44_Sub3_Sub1_Sub2Array15 = new Sprite[6];
        aBoolean17 = true;
        aBoolean18 = true;
        player_configuration = new int[128];
        anIntArray32 = new int[128];
    }
}
