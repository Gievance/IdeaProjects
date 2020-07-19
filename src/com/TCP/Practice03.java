package com.TCP;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

//客户端：数据来自键盘录入，直到输入的数据是886，发送数据结束
//服务器：接收的数据写入文本文件
public class Practice03 {
    public static void main(String[] args) throws IOException {
//客户端
        Socket socket = new Socket(InetAddress.getLocalHost(), 10003);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String line;
        while((line=br.readLine())!=null)
        {   if (line.equals("886"))
                break;
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        socket.close();
    }
}
