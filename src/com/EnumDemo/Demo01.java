package com.EnumDemo;

public class Demo01 {
    //    演示enum定义枚举类
    public static void main(String[] args) {
        EnumTest winter = EnumTest.WINTER;
        System.out.println(winter);//WINTER   -可见toString 方法被重载了
        System.out.println(EnumTest.class.getSuperclass());//class java.lang.Enum enum默认继承于Enum
//        演示values（ ）方法 遍历枚举对象
        EnumTest[] values = EnumTest.values();
        for (EnumTest e:values)
        {
            System.out.println(e+""+e.getName()+": "+e.getDes());
        }
//        演示valueOf(String )
        EnumTest winter1 = EnumTest.valueOf("WINTER");
        System.out.println(winter1);
    }
}

enum EnumTest {
    SUMMER("夏天", "夏日炎炎"), WINTER("冬天", "冬暖夏凉");
    private final String name;
    private final String des;

    EnumTest(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public String getDes() {
        return des;
    }
}