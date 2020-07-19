package com.InetAddressDemo;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

//UDP接收数据
//创建接收到的DatagramSocket对象
//创建一个数据包，用于接收数据
//调用DatagramSocket方法接收数据
//解析数据包，并显示在控制台
//关闭接收端
public class Address03 {
    public static void main(String[] args) throws IOException {
//        DatagramSocket​(int port)
//构造一个数据报套接字并将其绑定到本地主机上的指定端口。
        DatagramSocket data = new DatagramSocket(10086);
//        DatagramPacket​(byte[] buf, int length)
//        构造 DatagramPacket用于接收长度为 length数据包。
//        DatagramPacket​(byte[] buf, int offset, int length)
//        构造 DatagramPacket用于接收长度为 length数据包，指定缓冲区的偏移量。
        byte[] bytes = new byte[1024];//自己指定字节数组大小
        DatagramPacket rece = new DatagramPacket(bytes, bytes.length);
//        调用接收方法
        data.receive(rece);
//        解析数据byte[] 	getData()   返回数据缓冲区。
//        优化：1024太占空间，动态分配长度？
//        int 	getLength()    返回要发送的数据的长度或接收的数据的长度
        byte[] data1 = rece.getData();
        int len=rece.getLength();
        String s = new String(data1,0,len);
        System.out.println("数据是："+s);
//        优化：进行语句整合
//      System.out.println("数据是："+new String(rece.getData(),0,rece.getLength()));
//        关闭发送端
        data.close();


    }
}
