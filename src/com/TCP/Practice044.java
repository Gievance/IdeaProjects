package com.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//服务器
public class Practice044 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10004);
        Socket accept = server.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("TCPcontent2.txt"));

        String line;
        while((line=br.readLine())!=null)
        {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
//        服务器读取数据是阻塞式的。
//        拓展一个反馈：

        BufferedWriter bww = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bww.write("服务器收到了数据，文件上传成功");
        bww.newLine();
        bww.flush();
        br.close();
        server.close();
     }
}
