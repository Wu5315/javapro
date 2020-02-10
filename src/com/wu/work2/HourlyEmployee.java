package com.wu.work2;

public class HourlyEmployee extends ColaEmployee {
    private int hourmoney;
    private int hour;
    private int money;
    public HourlyEmployee(){}
    public HourlyEmployee(String name,int month,int hourmoney,int hour){
       super(name,month);
       this.hourmoney = hourmoney;
       this.hour = hour;
    }

    @Override
    public double getSalary(int month){
        if(hour<=160){
            return hourmoney*hour;
        }else{
            return hourmoney*hour+(hourmoney+hourmoney/2)*(hour-160);
        }
    }

}
