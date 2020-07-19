package com.PropertiesDemo;

import java.util.Random;
import java.util.Scanner;

//猜数字小游戏
public class Game {
    public Game() {
    }
    public static void start(){
//        1-100的随机数
        Random rand = new Random();
        int number=rand.nextInt(100)+1;
        while(true){
            System.out.println("请输入数字：");
            Scanner sc = new Scanner(System.in);
            int guess=sc.nextInt();
            if(guess>number)
                System.out.println("大了");
            else if (guess<number)
                System.out.println("小了");
            else
            {
                System.out.println("正正好");
                break;
            }
        }


    }
}
