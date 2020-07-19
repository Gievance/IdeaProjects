package com.函数式接口;

import java.util.function.Consumer;
//函数式接口
//·Consumer
//        void accept(T t);

//default Consumer<T> andThen(Consumer<? super T> after) {
//        Objects.requireNonNull(after);
//        return (T t) -> { accept(t); after.accept(t); };
//        }
public class ConsumerDemo {
    public static void main(String[] args) {
        opera("林青霞",(s)-> System.out.println(s),(s -> System.out.println(s)));
    }
    public static void opera(String name, Consumer<String> con1,Consumer<String> con2)
    {
        con1.accept(name);
        con2.accept(name);
        con1.andThen(con2).accept("调用");
        //andThen实现Consumer组合
    }
}
