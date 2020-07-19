package com.TCP;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable{
    public Socket s;
    public ServerThread(Socket s) {
        this.s=s;
    }

    @Override
    public void run() {
      try {
          BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//          BufferedWriter bw = new BufferedWriter(new FileWriter("TCPcontent3.txt"));
//解决名称冲突问题，上一行
          int count=1;
          File file = new File("TCPcontent[" + count + "].txt");
          while(file.exists())
          {
              count++;
              file=new File("TCPcontent["+count+".txt");
          }
          BufferedWriter bw = new BufferedWriter(new FileWriter(file));
          String line;
          while ((line = br.readLine()) != null) {
              bw.write(line);
              bw.newLine();
              bw.flush();
          }

          BufferedWriter bww = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
          bww.write("文件上传成功");
          bww.newLine();
          bww.flush();

          s.close();
          br.close();
      }catch (IOException i)
      {i.printStackTrace();}
    }
}
