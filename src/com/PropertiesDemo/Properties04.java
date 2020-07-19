package com.PropertiesDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

//游戏次数
//1.编写猜数字的游戏类
public class Properties04 {
    public static void main(String[] args) throws IOException {

        Properties pro = new Properties();
        FileReader fr = new FileReader("File2.txt");
//        void 	load​(Reader reader)
//以简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
        pro.load(fr);
        fr.close();

        String count=pro.getProperty("count");
        int i = Integer.parseInt(count);
        if(i>3)
        {
            System.out.println("游戏试玩结束，请充值");
        }else {
            i++;
            pro.setProperty("count", String.valueOf(i));
            FileWriter fw = new FileWriter("File2.txt");
//            void 	store​(Writer writer, String comments)
//将此 Properties表中的此属性列表（键和元素对）以适合使用 load(Reader)方法的格式写入输出字符流。
            pro.store(fw, null);
            fw.close();
            Game.start();
        }
    }
}
