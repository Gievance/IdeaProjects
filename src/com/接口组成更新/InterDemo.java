package com.接口组成更新;
//需求：定义一个接口、Inter 里面有两个抽象方法=void show1();void show2();
//定义接口的两个实现类\InterOne  \InterTwo
//定义测试类：InterDemo在主方法中，按照多态的方式创建对象并使用

public class InterDemo {
    public static void main(String[] args) {
        Inter i1=new InterOne();
        Inter i2=new InterTwo();

    }

}
