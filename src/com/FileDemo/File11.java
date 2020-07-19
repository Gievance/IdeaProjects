package com.FileDemo;

import java.io.FileInputStream;
import java.io.IOException;
//输入流的方法测试

public class File11 {
    public static void main(String[] args) throws IOException {
        FileInputStream fls=new FileInputStream("File.txt");

/*    获取数据
        int b=fls.read();
        System.out.println((char)b);
        b=fls.read();//读第二个字符，如果到末尾则返回-1
        System.out.println((char)b);
        System.out.println("-------------------------");
*/
/*        多次读取
        int by=fls.read();
        while(by!=-1)
        {
            System.out.print((char)by);
            by=fls.read();
        }

 */
//优化多次读取
        int by;
        while((by=fls.read())!=-1)
        {
            System.out.print((char)by);
        }
//        解释资源
        fls.close();
    }
}
