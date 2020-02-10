package com.wu.work2;

public class SalariedEmployee extends ColaEmployee {
    private int money;
    public SalariedEmployee(){}
    public SalariedEmployee(String name,int month,int money){
        super(name,month);
        this.money = money;
    }
    @Override
    public double getSalary(int month){
        return money;
    }
}
