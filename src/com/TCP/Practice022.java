package com.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//跟03相对应
public class Practice022 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10001);
        Socket accept = server.accept();
//        while(true) {
//            InputStream is = accept.getInputStream();
//            byte[] bytes = new byte[1024];
//            int len = is.read(bytes);
//            System.out.println("客户端数据：" +new String(bytes, 0, len));
//            OutputStream os = accept.getOutputStream();
//            os.write("已成功接收".getBytes());
//        }
//        优化：封装输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String line;
        while((line=br.readLine())!=null)
        {
            System.out.println("数据："+line);
        }
        server.close();
    }
}
