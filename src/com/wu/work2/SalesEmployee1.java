package com.wu.work2;

public class SalesEmployee1 extends ColaEmployee1{
    private int sale;
    private double ticheng;
    public SalesEmployee1(String name,int sale,double ticheng){
        super(name);
        this.sale = sale;
        this.ticheng = ticheng;
    }
    @Override
    public double getSalary(){
        return sale*ticheng;
    }
}
