package com.Lambda表达式;
//Lambda表达式的省略模式
public class Lambda05 {
    public static void main(String[] args) {
//        useAddable((int x,int y)->{return x+y;});
        useAddable(( x, y)->{return x+y;});
        useFly((s)->{
            System.out.println(s);
        });
//        如果参数有且只有一个，那么小括号可以省略
        useFly(s -> {
            System.out.println(s);
        });
//        如果代码块语句只有一条。可以省略大括号和分号
        useFly(s -> System.out.println(s));
        useAddable((x,y)->x+y);//只有一条语句，return存在也要省略


//        注意事项：
        Fly f=(s)-> System.out.println(s);
        useFly(f);
        useFly((s)-> System.out.println(s));

    }

    public static void useFly(Fly f){
        f.fly("风和日丽，晴空万里");//调用接口里的方法，并传入String参数
    }
    public static void useAddable(Addable a)
    {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
