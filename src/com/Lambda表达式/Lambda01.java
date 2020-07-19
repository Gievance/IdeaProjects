package com.Lambda表达式;
//函数式编程
public class Lambda01 {
//   启动一个线程，在控制台输出一句话：多线程启动
//    利用函数式编程法编写、
public static void main(String[] args) {
//方式一    new Thread(new LambdaRunable()).start();
//  方式二
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("多线程启动");
//            }
//        }).start();
//Lambda表达式
    new Thread(()->{
        System.out.println("多线程启动");
    }).start();
}
}
