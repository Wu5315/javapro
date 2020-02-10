package com.wu.work2;

public class SalesEmployee extends ColaEmployee {
    private int sale;
    private double advance;
    public SalesEmployee(){}
    public SalesEmployee(String name,int month,int sale,double advance){
        super(name,month);
        this.sale = sale;
        this.advance = advance;
    }
    @Override
    public double getSalary(int month){
        return  sale*advance;
    }

}
