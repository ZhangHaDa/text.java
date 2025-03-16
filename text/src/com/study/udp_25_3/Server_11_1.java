package com.study.udp_25_3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_11_1 {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(10000);

        Socket socket = ss.accept();

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("text\\abcd.jpeg"));
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());

        byte[] bytes  = new byte[1024];
        int len;
        while((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.flush();

        //socket.shutdownInput();

        BufferedOutputStream boss = new BufferedOutputStream(socket.getOutputStream());
        boss.write("123".getBytes());
        boss.flush();
      //  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//        bw.write("上传成功!");
//        bw.newLine();
//        bw.flush();

        socket.close();
        ss.close();
    }
}
