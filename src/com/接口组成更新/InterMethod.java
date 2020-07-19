package com.接口组成更新;
//测试，接口中的默认方法、静态方法
public class InterMethod{
    public static void main(String[] args) {
        TestDandS s = new TestDandS();
        s.show();
        s.showDe();
        DefaultImp.showSta();
        StaImp.showSta();
    }
}
