package com.FileDemo;

import java.io.*;

//需求：借助打印流，实现复制文件
public class File31 {
    public static void main(String[] args) throws IOException {
        File InFile = new File("File4.txt");
        File OutFile = new File("s:\\FileDemo\\",InFile.getName());
//        调用Buff方法实现文件复制
//        Buff(InFile, OutFile);
//        借助打印流实现文件复制
        Print(InFile,OutFile);

    }

    private static void Print(File inFile, File outFile) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(inFile));
        PrintWriter pw = new PrintWriter(new FileWriter(outFile), true);
        String line;
        while ((line=br.readLine())!=null)
        {
            pw.println(line);
        }
        br.close();
        pw.close();
    }

    public static void Buff(File f1,File f2)throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(f1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(f2));

        String line;
        while((line=br.readLine())!=null)
        {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();

    }
}
