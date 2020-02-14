package com.wu.work2;

public class Main1 {
    public static void main(String[] args) {
        SalariedEmployee1 salariedEmployee1 = new SalariedEmployee1("张三",5000);
        HourlyEmployee1 hourlyEmployee1 = new HourlyEmployee1("李四",200,30);
        SalesEmployee1 salesEmployee1 =new SalesEmployee1("王五",10000,0.5);
        System.out.println(salariedEmployee1.getSalary());
        System.out.println(hourlyEmployee1.getSalary());
        System.out.println(salesEmployee1.getSalary());
    }
}
