package com.Stream流;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream练习2 {
    public static void main(String[] args) {
        ArrayList<String> man = new ArrayList<>();
        ArrayList<String> woman = new ArrayList<>();
        man.add("郭德纲");
        man.add("贾宝玉");
        man.add("李华");
        man.add("张根硕");
        man.add("胡歌");
        man.add("彭于晏");

        woman.add("薛宝钗");
        woman.add("林黛玉");
        woman.add("王熙凤");
        woman.add("贾玲");
        woman.add("伽罗");
        woman.add("林婉婷");
//        一、男演员要名字为3个字的前三人。
        Stream<String> s1 = man.stream().filter(s -> s.length() >= 3).limit(3);
//        二、女演员姓林，并且不要第一个
        Stream<String> s2 = woman.stream().filter(s -> s.startsWith("林")).skip(1);
//        合并1和2
        Stream<String> concat = Stream.concat(s1, s2);
//        创建一个演员类，将步骤3作为构造参数，创建演员对象。遍历
//        concat.forEach(s -> {
//            Actor actor = new Actor(s);
//            System.out.println(actor.getName());
//        });
//优化:注，Function 构造器引用会创建对象 用map可以用function接口，将string 转化成Actor对象
        concat.map(Actor::new).forEach(p-> System.out.println(p.getName()));

    }
}
