package com.TCP;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

//练习
//客户端：数据来自文本文件
//服务器：接收到的数据写入文本文件
public class Practice04 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),10004);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader br = new BufferedReader(new FileReader("JavaSun.txt"));
        String line;
        while((line=br.readLine())!=null)
        {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
//        自定义结束标记
//        bw.write("886");
//        bw.newLine();
//        bw.flush();
//        优化 ：shutdownOutput,
        socket.shutdownOutput();

        BufferedReader brr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("服务器反馈："+new String(brr.readLine()));
        br.close();
        socket.close();
    }
}
