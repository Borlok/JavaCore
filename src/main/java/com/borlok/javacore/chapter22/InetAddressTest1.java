package com.borlok.javacore.chapter22;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressTest1 {
    public InetAddressTest1() {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println(inetAddress);
            inetAddress = InetAddress.getByName("www.HerbSchildt.com");
            System.out.println(inetAddress);
            InetAddress [] SW = InetAddress.getAllByName("www.nba.com");
            System.out.println(Arrays.toString(SW));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
