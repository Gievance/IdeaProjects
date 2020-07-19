package com.FileDemo;
//序列化流的三个问题
//一、对象序列化后，修改对象类文件，再反序列化可以吗？不可以(除非解决下列三个问题
//异常：InvalidClassException：
//      Serialization运行时检测到类的以下问题之一时抛出。
//       该类的串行版本与从流中读取的类描述符的版本不匹配--解决办法：自定义public static final long serialVersionUID
//       该类包含未知的数据类型
//       该类没有可访问的no-arg构造函数
//二、某个成员变量，不想被序列化？怎么办
//加个关键字：transient ，是变量不参加序列化
//

import java.io.*;

public class File33 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        read();
    }
//序列化
    private static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("File5.txt"));
        Student s=new Student("小黑",25);
        oos.writeObject(s);
        oos.close();
    }
//反序列化
    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("File5.txt"));
        Object o = ois.readObject();
        Student student=(Student)o;
        System.out.println(student.getClasss()+ student.getName()+ student.getAge()+ student.getArea());
        ois.close();
    }
}
