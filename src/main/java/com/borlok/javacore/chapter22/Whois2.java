package com.borlok.javacore.chapter22;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.SocketHandler;

/**
 * Оперирование сокетами
 */
public class Whois2 {
    public Whois2() {
        int c;
        try (Socket s = new Socket("whois.internic.net", 43)) {
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();
            String text = "OraclePressBooks.com";

            byte [] buf = text.getBytes();
            out.write(buf);
            while ((c = in.read()) != -1) {
                System.out.println((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
