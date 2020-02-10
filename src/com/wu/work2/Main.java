package com.wu.work2;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee a = new SalariedEmployee("张三",2,2500);
        HourlyEmployee b = new HourlyEmployee("李四",2,20,200);
        SalesEmployee c = new SalesEmployee("王五",2,6000,0.5);
        System.out.println(a.getSalary(2));
        System.out.println(b.getSalary(3));
        System.out.println(c.getSalary(2));
    }
//    public static void payWage(){
//        System.out.println();
//    }
}
