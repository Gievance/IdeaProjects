package com.FileDemo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//需求：从S:\\FileDemo\\SonofSun.txt的内容复制到JavaSun.txt
public class File12 {
    public static void main(String[] args) throws IOException {
        File file=new File("JavaSun.txt");
        if(!file.exists())
            file.createNewFile();
        FileInputStream fis = new FileInputStream("S:\\FileDemo\\SonofSun.txt");
        FileOutputStream fos = new FileOutputStream(file);

//        读到输入流
        byte[] bytes=fis.readAllBytes();
        fos.write(bytes);


//        释放资源
        fos.close();
        fis.close();

    }
}
