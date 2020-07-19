package com.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Practice011 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        Socket accept = ss.accept();
        InputStream is = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int len=is.read(bytes);
        System.out.println("数据："+new String(bytes,0,len));
        OutputStream os = accept.getOutputStream();
        os.write("数据已收到".getBytes());
        ss.close();
    }
}
