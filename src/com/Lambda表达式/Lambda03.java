package com.Lambda表达式;
//练习，lambda表达式的使用----带形参
//定义一个fly接口，有一个抽象方法fly
//定义一个测试类，有一个形参为接口的方法，一个主方法
public class Lambda03 {
    public static void main(String[] args) {
//        利用lambda调用
        useFly((String s)->{
            System.out.println(s);
            System.out.println("飞机");
        });
        System.out.println("------------------");
//        匿名内部类
        useFly(new Fly() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("飞机");
            }
        });

    }
    public static void useFly(Fly f){
        f.fly("风和日丽，晴空万里");//调用接口里的方法，并传入String参数
    }
}
