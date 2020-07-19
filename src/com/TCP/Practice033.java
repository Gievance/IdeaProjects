package com.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//服务器：接收的数据写入文本文件
public class Practice033 {
    public static void main(String[] args) throws IOException {
        File file = new File("TCPcontent.txt");
        if (!file.exists())
            file.createNewFile();
        ServerSocket server = new ServerSocket(10003);
        Socket accept = server.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        String line;
        while((line=br.readLine())!=null)
        {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        server.close();


    }
}
