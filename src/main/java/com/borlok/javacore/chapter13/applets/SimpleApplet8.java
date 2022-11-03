package com.borlok.javacore.chapter13.applets;

/**
 * Создание апплета (не юзабельно и нерекомендованно к использованию)
 */

import java.applet.Applet;
import java.awt.*;
/*
<applet code="SimpleApplet8.class" width="200" height="200"></applet>
*/
public class SimpleApplet8 extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawString("Простейший апплет", 20, 20);
    }
}
