package com.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInoutStream{

        //    skip+read+write+available
        public static void main(String[] args) throws IOException {
            FileInputStream fis = new FileInputStream("e:/FileDemo/movefile.txt");
            int size = fis.available();
            System.out.println("可读字节数：" + size);
            int c;
            while ((c=fis.read())!= -1) {
                System.out.print(new String(Character.toString(c)));
            }
            fis.close();
        }
}
