package com.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP01 {
    public static void main(String[] args) throws IOException {
//        创建客户端Socket对象
//        Socket() 创建一个未连接的套接字，系统默认类型为SocketImpl。
//        Socket​(String host, int port) 创建流套接字并将其连接到指定主机上的指定端口号。
        Socket socket = new Socket(InetAddress.getLocalHost(), 10086);


//        获取输出流，写数据
        OutputStream os = socket.getOutputStream();
        os.write("TCP，我来了".getBytes());
//         关闭资源

        socket.close();

    }
}
