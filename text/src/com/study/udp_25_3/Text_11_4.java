package com.study.udp_25_3;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Text_11_4 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds  = new DatagramSocket();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请你输入要发送的消息:");
            String str = sc.nextLine();
            if("886".equals(str))
                break;
            byte[] bytes = str.getBytes();
            int port = 10086;
            InetAddress address = InetAddress.getByName("127.0.0.1");
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

            ds.send(dp);
        }

        ds.close();

    }
}
