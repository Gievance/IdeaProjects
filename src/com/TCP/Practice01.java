package com.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

//TCP练习
//客户端
public class Practice01 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 10000);

        OutputStream os = socket.getOutputStream();
        os.write("我来了".getBytes());
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println("服务器反馈："+new String(bytes,0,len));
        socket.close();
    }
}
