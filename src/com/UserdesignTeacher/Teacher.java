package com.UserdesignTeacher;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.YEAR;

public class Teacher {
    private int identify;
    private int teacid;
    private String prof;
    private String name;
    private String sex;
    private int age;
    public Teacher(){
        //无参自定义初始化
        identify=1;
        teacid=1;
        prof="计算机与科学";
        name="未定义";
        sex="男";
        age=20;
    }
    public Teacher(int identify, int teacid, String prof, String name, String sex, int age) {
        this.identify = identify;
        this.teacid = teacid;
        this.prof = prof;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public  void  Old()
    {   int age2=-age;
        Calendar cal=Calendar.getInstance();
        cal.add(YEAR,age2);
        System.out.println("出身年份为："+cal.get(YEAR)+":"+(cal.get(Calendar.MONTH)+1)+":"+cal.get(Calendar.DAY_OF_MONTH));
    }
}
