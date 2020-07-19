package com.TCP;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

//练习一：
//  客户端：发送数据，接收服务器反馈
//  服务器：接收数据，给出反馈
public class Practice02 {
    public static void main(String[] args) throws IOException {
//        创建Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(),10001);
//        输出流和套接字绑定
//        OutputStream os = socket.getOutputStream();
//        os.write("第一次握手".getBytes());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String line;
        while((line=br.readLine())!=null)
        {
            if(line.equals("886"))
                break;
//            OutputStream os = socket.getOutputStream();
//            os.write(line.getBytes());
        bw.write(line);
        bw.newLine();
        bw.flush();
        }
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        System.out.println("服务器反馈："+new String(bytes,0,is.read(bytes)));
        socket.close();
    }
}
