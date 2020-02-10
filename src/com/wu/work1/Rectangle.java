package com.wu.work1;

public class Rectangle extends Shape{
    private int width;
    private int height;
    public Rectangle(){}
//    public Rectangle(String color){
//        super(color);
//    }
    public Rectangle(int width,int height,String color){
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double  getArea(){
        return width*height;
    }
    @Override
    public double getPer(){
        return 2*width+2*height;
    }
    @Override
    public void showAll(){
        System.out.println("矩形的面积是"+getArea());
        System.out.println("矩形的周长是"+getPer());
        System.out.println("矩形的颜色是"+getColor());
    }
}
