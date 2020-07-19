package com.LockDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
//Lock接口实现数据安全
//lock/unlock方法
public class Lock01 {
   private Lock lock = new ReentrantLock();
//   ReentrantLock()是 Lock 的子类

   public void method(Thread thread)
   {
       lock.lock();//获取锁对象
       try {
           System.out.println(thread.getName()+"获得锁");

       }catch (Exception e){
           e.printStackTrace();
       }finally {
           System.out.println(thread.getName()+"释放了锁");
           lock.unlock();//释放锁
       }
   }
}
