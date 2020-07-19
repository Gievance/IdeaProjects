package com.函数式接口;

import java.util.function.Consumer;

//需求：格式化打印信息
//下面的字符串数组当中存有多条信息，请按照格式“ 姓名:XX。性别:XX。 ”的格式
// 将信息打印出来。要求将打印姓 名的动作作为第一个 Consumer 接口的Lambda实例
// 将打印性别的动作作为第二个 Consumer 接口的Lambda实 例，
// 将两个 Consumer 接口按照顺序“拼接”到一起。
public class 练习1 {
//    public static void main(String[] args) {
//        String[] array = { "大雄，男", "静香，女", "胖虎，男" };
//       for(String s:array)
//        show(s,ss -> System.out.print("姓名："+ss.substring(0,2)+" "),ss -> System.out.println("性别："+ss.substring(3, 4)));
//    }
//    private static void show(String arr,Consumer<String> con,Consumer<String> con2)
//    {
//        con.andThen(con2).accept(arr);
//    }
//    方式二，利用split方法
    public static void main(String[] args) {
        String[] array = { "大雄,男", "静香,女", "胖虎,男" };
    show(s -> System.out.print("姓名："+s.split(",")[0]+"，"), s -> System.out.println("性别："+s.split(",")[1]+"。"), array);

}
    private static void show(Consumer<String> con,Consumer<String> con2,String[] arr)
{
     for (String s:arr)
        {
        con.andThen(con2).accept(s);
        }
    }
}
