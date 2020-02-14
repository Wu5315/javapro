package com.wu.work2;

public class HourlyEmployee1 extends ColaEmployee1{
    private int hour;
    private int hourmoney;

    public HourlyEmployee1(String name, int hour, int hourmoney) {
        super(name);
        this.hour = hour;
        this.hourmoney = hourmoney;
    }

    @Override
    public double getSalary() {
        if(hour<=160){
            return hour*hourmoney;
        }else {
            return (hour-160)*hourmoney*1.5+160*hourmoney;
        }
    }
}
