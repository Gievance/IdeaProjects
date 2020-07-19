package com.TCP;
//客户端：数据来自文本文件，接收服务器反馈
//服务器：接收到的数据写入文本文件， 给出反馈，代码用线程进行封装，为每一个客户端开启一个线程

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Practice05 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 10005);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader br = new BufferedReader(new FileReader("Student.txt"));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
            socket.shutdownOutput();
            System.out.println("服务器反馈：" + new String(br2.readLine()));
            br.close();
            br2.close();
            socket.close();

    }
}
