package com.juc_25_3;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Text_11_1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("LAPTOP-NK7L0O9P");

        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());
    }
}
