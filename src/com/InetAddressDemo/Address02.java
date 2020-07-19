package com.InetAddressDemo;
//掌握UDP协议通信
//
//UDP发送数据：
//        创建发送端Socket对象
//        创建数据，并打包
//        调用方法发送数据
//        关闭发送端

import java.io.IOException;
import java.net.*;

public class Address02 {
    public static void main(String[] args) throws IOException {
//        DatagramSocket()
//        构造一个数据报套接字并将其绑定到本地主机上的任何可用端口。
        DatagramSocket data = new DatagramSocket();

//        DatagramPacket​(byte[] buf, int length, InetAddress address, int port)
//        构造一个数据报包，用于将长度为 length的数据包发送到指定主机上的指定端口号。
        byte[] bytes = "第一次发送UDP报文".getBytes();
//        int len=bytes.length;
//        InetAddress byName = InetAddress.getByName("169.254.189.177");
//        int port=10088;
//        DatagramPacket dp = new DatagramPacket(bytes, len, byName, port);

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("169.254.189.177"), 10086);
        
//        void 	send​(DatagramPacket p)
//        从此套接字发送数据报包。
        data.send(dp);

        data.close();
    }
}
