package com.FileDemo;

import java.io.*;

//了解对象序列化,反序列化
public class File32 {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("File3.txt"));
//        创建对象
        Student st = new Student("小溪",32);
//        void 	writeObject​(Object obj)   将指定的对象写入ObjectOutputStream。
        oos.writeObject(st);
        oos.close();
//        java.io.NotSerializableException: com.FileDemo.Student
//        当实例需要具有Serializable接口时抛出
//        将Student实现Serializable接口
        File f = new File("File3.txt");
//反序列化
        Os(f);
    }
    public static void Os(File file) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        Object 	readObject()
//        从ObjectInputStream  中读取一个对象
        Object obj = ois.readObject();
        Student s=(Student)obj;
        System.out.println(s.getName()+s.getAge());

        ois.close();
    }

}
