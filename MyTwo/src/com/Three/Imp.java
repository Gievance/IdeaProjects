package com.Three;

import com.ModelP.MyService;

import java.util.ServiceLoader;

public class Imp {

    public static void main(String[] args) {
        ServiceLoader<MyService> load = ServiceLoader.load(MyService.class);
//       增强for遍历
        for(MyService s:load)
        {
            s.service();
        }


    }
}
