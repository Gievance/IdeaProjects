package com.PropertiesDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

//借助Properties完成文件的写入，与读取
//即Properties与IO结合
public class Properties03 {
    public static void main(String[] args) throws IOException {
        write();
        read();
    }

    private static void read() throws IOException {
        Properties pro = new Properties();
        FileReader fr = new FileReader("File6.txt");
        pro.load(fr);
        fr.close();
        System.out.println(pro);
    }

    private static void write() throws IOException {
        Properties pro = new Properties();
        pro.put("class1", "西红1");
        pro.put("class2", "西红2");
        pro.put("class3", "西红3");
        pro.put("class4", "西红4");
        FileWriter fileWriter = new FileWriter("File6.txt");
//        void 	store​(Writer writer, String comments)
//将此 Properties表中的此属性列表（键和元素对）以适合使用 load(Reader)方法的格式写入输出字符流。
        pro.store(fileWriter, null);
        fileWriter.close();
    }
}
