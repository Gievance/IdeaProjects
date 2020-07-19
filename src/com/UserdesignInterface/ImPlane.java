package com.UserdesignInterface;

public class ImPlane implements PlaneGraphics{
    int len;
    int wei;

    public ImPlane(int len, int wei) {
        this.len = len;
        this.wei = wei;
    }

    @Override
    public double area() {
        return len*wei;
    }

    @Override
    public double perimeter() {
        return 2*(wei+len);
    }

    @Override
    public void print() {
        System.out.println("are="+area());
        System.out.println("perimeter="+perimeter());
    }
}
