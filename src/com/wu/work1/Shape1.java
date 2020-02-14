package com.wu.work1;

public abstract class Shape1 {
    private double area;
    private double per;
    private String color;
    public Shape1(){}
    public Shape1(String color){
        this.color = color;
    }

    public abstract double getArea();
    public abstract double getPer();
    public abstract void showAll();

    public void setArea(double area) {
        this.area = area;
    }



    public void setPer(double per) {
        this.per = per;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
