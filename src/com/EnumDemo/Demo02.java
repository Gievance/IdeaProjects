package com.EnumDemo;

public class Demo02 {
    //    演示自定义枚举类
    public static void main(String[] args) {
        EnumDefined summer = EnumDefined.SUMMER;
        System.out.println("夏天对象:"+summer.getEnumname()+summer.getEnumdes());

//        发现不能调用values方法，同时生成一个枚举类.java文件

    }

}

class EnumDefined {
    //    定义枚举属性，private final
    private final String enumname;
    private final String enumdes;

    //   枚举属性定义为final，若不赋值则报错，解决？一、初始化；二、构造器赋值；三、代码块赋值
//    演示构造器赋值，构造器一定定义为private
    private EnumDefined(String name, String des) {
        this.enumname = name;
        this.enumdes = des;
    }

    //    定义枚举对象:public static final修饰
    public static final EnumDefined SPRING = new EnumDefined("春天", "春心荡漾");
    public static final EnumDefined SUMMER = new EnumDefined("夏天", "夏日炎炎");
    public static final EnumDefined AUTUMN = new EnumDefined("秋天", "秋高气爽");
    public static final EnumDefined WINTER = new EnumDefined("冬天", "冬暖夏凉");

//    定义方法

    public String getEnumname() {
        return enumname;
    }

    public String getEnumdes() {
        return enumdes;
    }
//    有时也重载toString

    @Override
    public String toString() {
        return "EnumDefined{" +
                "enumname='" + enumname + '\'' +
                ", enumdes='" + enumdes + '\'' +
                '}';
    }
}
