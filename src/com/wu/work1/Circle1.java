package com.wu.work1;

public class Circle1 extends Shape1{
    private int radius;

    public Circle1(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getPer() {
        return 2*3.14*radius;
    }

    @Override
    public void showAll() {
        System.out.println("圆的面积是："+getArea());
        System.out.println("圆的周长是："+getPer());
        System.out.println("圆的颜色是："+getColor());
    }
}
