package com.borlok.javacore.chapter22;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Пример обработки дейтаграм
 */
public class WriteServer6 {
    public static int serverPort = 998;
    public static int clientPort = 999;
    public static int buffer_size = 1024;
    public static DatagramSocket ds;
    public static byte [] buffer = new byte[buffer_size];

    public static void theServer() {
        int pos = 0;
        while (true){
            try {
                int c = System.in.read();
                switch (c) {
                    case -1:
                        System.out.println("Сервер завершает сеанс связи.");
                        ds.close();
                        return;
                    case '\r':
                        break;
                    case '\n':
                        ds.send(new DatagramPacket(buffer, pos,
                                InetAddress.getLocalHost(),clientPort));
                        pos = 0;
                        break;
                    default:
                        buffer [pos++] = (byte) c;
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void theClient() {
        while (true) {
            DatagramPacket p = new DatagramPacket(buffer,buffer.length);
            try {
                ds.receive(p);
                System.out.println(new String(p.getData(), 0, p.getLength()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public WriteServer6(String [] args) {
        try {
            if (args.length == 1) {
                ds = new DatagramSocket(serverPort);
                theServer();
            } else {
                ds = new DatagramSocket(clientPort);
                theClient();
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
