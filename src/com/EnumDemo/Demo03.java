package com.EnumDemo;

public class Demo03 {
    //    演示枚举类实现接口
    public static void main(String[] args) {
//        一：调用公有的接口方法
//        EnumTest2 winter = EnumTest2.valueOf("WINTER");
//        winter.show();
//        二：调用各自的接口方法
        for(EnumTest2 e:EnumTest2.values())
        {
            e.show();
        }
    }
}
interface display{
    void show();
}
enum EnumTest2 implements display{
//  二：各自重载接口方法
    SUMMER("夏天", "夏日炎炎"){
    @Override
    public void show() {
        System.out.println("这是夏天");
    }
}, WINTER("冬天", "冬暖夏凉"){
        @Override
        public void show() {
            System.out.println("这是冬天");
        }
    };
    private final String name;
    private final String des;

    EnumTest2(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public String getDes() {
        return des;
    }
//     一：
//    @Override
//    public void show() {
//        System.out.println("接口中的方法被调用");
//    }
}