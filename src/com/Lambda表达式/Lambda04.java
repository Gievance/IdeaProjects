package com.Lambda表达式;
//Lambda的使用，----两个形参
//定义：Addable接口，有个add抽象方法
//定义一个测试类，Lambda04提供两个方法，一个是useAddable(Addable a),一个是主方法
public class Lambda04 {
    public static void main(String[] args) {
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return x+y;
            }
        });
        System.out.println("-------------");
        useAddable((int x,int y)->{
            return x+y;
        });//实际是代替a.add()

    }
    public static void useAddable(Addable a)
    {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
