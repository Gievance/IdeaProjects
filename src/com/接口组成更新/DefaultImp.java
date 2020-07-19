package com.接口组成更新;

public interface DefaultImp {
    void show();
    default void showDe(){
        System.out.println("默认方法被调用");
    }
    static void showSta(){
        System.out.println("静态方法被调用");
    }
}
