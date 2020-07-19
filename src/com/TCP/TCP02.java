package com.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务器端
public class TCP02 {
    public static void main(String[] args) throws IOException {
//        ServerSocket​(int port)创建绑定到指定端口的服务器套接字。
        ServerSocket ss = new ServerSocket(10086);
//        Socket 	accept() 侦听对此套接字的连接并接受它。
        Socket accept = ss.accept();
        InputStream is= accept.getInputStream();
        byte[] bytes = new byte[1024];
        int len=is.read(bytes);
        String s = new String(bytes, 0, len);
        System.out.println("数据是："+s);
        ss.close();
    }
}
