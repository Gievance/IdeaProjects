package com.InetAddressDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

//UDP接收端
public class Practice02 {
    public static void main(String[] args) throws IOException {
        DatagramSocket data = new DatagramSocket(10088);
        while(true) {
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            data.receive(dp);
            System.out.println("数据是："+new String(dp.getData(),0,dp.getLength()));
        }
//        不用关闭接收端
//        data.close;
    }
}
