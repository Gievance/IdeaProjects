package com.InetAddressDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

//UDP通信练习
//需求：UDP发送数据：数据来自键盘录入，直到886代表结束
//UDP接收数据，采用死循环，不停接收数据
public class Practice01 {
    public static void main(String[] args) throws IOException {
//       创建DatagramSocket对象
        DatagramSocket data = new DatagramSocket();
//        创建缓冲字符流
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line=br.readLine())!=null)
        {
//       创建数据包，不断发送数据，直到出现886
            if (line.equals("886"))
                break;
            byte[] bytes =line.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(),10088);
            data.send(dp);
        }
        data.close();
    }
}
