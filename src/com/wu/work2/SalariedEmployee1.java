package com.wu.work2;

public class SalariedEmployee1 extends ColaEmployee1{
    private double money;

    public SalariedEmployee1(String name,double money) {
        super(name);
        this.money = money;
    }

    @Override
    public double getSalary() {
        return money;
    }
}
