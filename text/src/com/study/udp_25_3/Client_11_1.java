package com.study.udp_25_3;

import java.io.*;
import java.net.Socket;

public class Client_11_1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10000);

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("text\\abc.jpeg"));

        BufferedOutputStream bos  = new BufferedOutputStream(socket.getOutputStream());

        //读文件
        byte[] bytes = new byte[1024];
        int b;
        while((b = bis.read(bytes))!=-1){
            bos.write(bytes,0,b);
        }
        bos.flush();
        socket.shutdownOutput();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = br.readLine();
        System.out.println(str);

        socket.close();
    }
}
