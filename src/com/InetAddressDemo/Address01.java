package com.InetAddressDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;
//掌握InetAddress的创建，和方法
public class Address01 {
    public static void main(String[] args) throws UnknownHostException {
//  ×      InetAddress net = new InetAddress("LAPTOP-A7OQQI4V");  InetAddress是没有构造方法的
        InetAddress net = InetAddress.getByName("LAPTOP-A7OQQI4V");
        //也可以是IP地址 InetAddress net = InetAddress.getByName("169.254.189.177");
//        getByName获取 InetAddress对象
        String hostName = net.getHostName();
        String hostAddress = net.getHostAddress();
        System.out.println(hostName);
        System.out.println(hostAddress);

        System.out.println("-------");
//        getLocalHost获取InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        String hostAddress1 = localHost.getHostAddress();
        String hostName1 = localHost.getHostName();
        System.out.println(hostName1+"\n"+hostAddress1);

        System.out.println("-------");
//        自定义InetAddress对象  ，有UnknownHostException异常，未解决
//        byte[] bytes = "192.168.1.2".getBytes();
//        InetAddress localHost2 =InetAddress.getByAddress("涂志伟的computer",bytes);
//        String hostAddress2 = localHost2.getHostAddress();
//        String hostName2 = localHost2.getHostName();
//        System.out.println(hostName2+"\n"+hostAddress2);
    }
}
