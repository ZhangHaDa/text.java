package com.study.udp_25_3;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client_11 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10000);

        OutputStream os = socket.getOutputStream();

        os.write("你好".getBytes());

        os.close();
        socket.close();
    }
}
