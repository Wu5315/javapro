package com.wu.work2;

public abstract class ColaEmployee {
    private String name;
    private int month;
    public ColaEmployee(){

    }
    public ColaEmployee(String name,int month){
        this.name = name;
        this.month = month;
    }
    public abstract double getSalary(int month);
}
