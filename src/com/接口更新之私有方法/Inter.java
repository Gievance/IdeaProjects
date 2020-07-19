package com.接口更新之私有方法;

public interface Inter {
//    利用私有方法，将不同方法之间的共性给实现
    private static void showT(){
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
    }
//    为啥都用showT就是图个方便，这个注意事项在Typero有写
    default void show(){
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
        showT();
    }
    default void show2(){
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
        showT();
    }
    static void show3(){
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
       showT();
    }
    static void show4(){
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
        showT();
    }
}
