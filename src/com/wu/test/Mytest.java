package com.wu.test;

public class Mytest {
    public static void main(String[] args) {

        //1~~100 数累加
        int sum = 0;
        for(int i = 1;i <= 100;i++){
            sum = sum +i;
        }
        System.out.println(sum);






        //判断闰年
        //4年1闰，100年不闰，400年再闰
        int a = 1900;
        if((a%4==0 && a%100!=0)||a%400==0){
            System.out.println(a+"是闰年");
        }else{
            System.out.println(a+"不是闰年");
        }





        // 1~~100中的质数
        //从2开始除到这个数的1/2，余数都不等于0的是质数
        for(int i = 1;i <= 100;i++){
            boolean flag = true;
            for(int j = 2;j <= i/2;j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }




        //1~~100质数和
        int sum1 = 0;
        for(int i = 2;i <= 100;i++){
            boolean flag = true;
            for(int j = 2;j <= i/2;j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                sum1 = sum1 +i;
            }
        }
        System.out.println(sum1);
    }
}
