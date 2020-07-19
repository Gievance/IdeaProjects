package com.Stream流;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

//中间操作，比如Stream<T> filter（Predicate pre)
//- Stream<T> 	limit(long maxSize) 返回由此流的元素组成的流，截断长度不超过 maxSize 。
//- Stream<T> 	skip(long n)    在丢弃流的第一个 n元素后，返回由此流的其余元素组成的流。
//static <T> Stream<T> 	concat​(Stream<? extends T> a, Stream<? extends T> b)
//创建一个延迟连接的流，其元素是第一个流的所有元素，后跟第二个流的所有元素。
//Stream<T> 	distinct()
// 返回由此流的不同元素（根据 Object.equals(Object) ）组成的流。
//Stream<T> 	sorted()
//返回由此流的元素组成的流，按照自然顺序排序。
//Stream<T> 	sorted​(Comparator<? super T> comparator)
//        返回由此流的元素组成的流，根据提供的 Comparator进行排序。
// <R> Stream<R> 	map(Function<? super T,? extends R> mapper)
//        返回一个流，该流包含将给定函数应用于此流的元素的结果
//        - IntStream 	mapToInt(ToIntFunction<? super T> mapper)
//        返回 IntStream其中包含将给定函数应用于此流的元素的结果
public class Stream之中间操作 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("小白龙");
        arr.add("大黑龙");
        arr.add("消融");
        arr.add("白");
        arr.add("大黑龙");

//        把list集合中长度大于2的输出
        arr.stream().filter(s -> s.length()>2).forEach(System.out::println);
        System.out.println("------");
//      取前三个流，输出
        arr.stream().limit(3).forEach(System.out::println);
        System.out.println("-------");
//      取后三个流，输出
        arr.stream().skip(arr.size()-3).forEach(System.out::println);
        System.out.println("----------");
//        取前三个数据组成一个流
        Stream<String> limit = arr.stream().limit(3);
//        跳过2个数据组成一个流
        Stream<String> skip = arr.stream().skip(2);
//        合并一和二，组成一个流，输出
//        Stream.concat(limit,skip).forEach(System.out::println);
        System.out.println("----------");
//        合并一和二，组成一个流，要求字符串不能重复，输出
        Stream.concat(limit,skip).distinct().forEach(System.out::println);
        System.out.println("------------");
//        自然排序
//    长度相同则为自然排序
        System.out.println("----自然排序----");
        arr.stream().sorted().forEach(System.out::println);
        System.out.println("----比较器排序-----注：Comparator也是函数式接口");
        arr.stream().sorted((s1,s2)->s1.length()-s2.length()).forEach(System.out::println);
        System.out.println("-----Map------");
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("10");
        arr2.add("20");
        arr2.add("30");
        arr2.add("40");
        arr2.add("50");
        arr2.stream().map(s -> Integer.parseInt(s)).forEach(System.out::println);
        System.out.println("------mapToInt--------");
        arr2.stream().mapToInt(Integer::parseInt).forEach(System.out::println);
//        IntStream中有Sum()
        System.out.println(" Sum()");
        System.out.println(arr2.stream().mapToInt(Integer::parseInt).sum());
    }
}
