package com.wu.test1;

public class Test1 {
    public static void main(String[] args) {
        //1--100数累加
        int sum = 0;
        for(int i = 1;i <= 100;i++){
            sum = sum + i;
        }
        System.out.println(sum);
        //判断闰年
        int a = 1992;
        if((a%4==0 && a%100!=0) || a%400==0){
            System.out.println(a+"是闰年");
        }else{
            System.out.println(a+"不是闰年");
        }
        //1-100中的质数
        for(int i = 2;i <= 100;i++){
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
        //1-100质数和
        int sum1 = 0;
        for(int i = 2;i <= 100;i++){
            boolean flag = true;
            for(int j = 2;j <= i/2;j++ ){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                sum1 = sum1 + i;
            }
        }
        System.out.println(sum1);
        //1-4 拿出三个数组合
        for(int i = 1;i <= 4 ;i++){
            for(int j = 1; j <= 4;j++){
                if(i != j){
                    for(int l = 1;l <= 4;l++){
                        if(l != i && l != j){
                            System.out.println(100*i+10*j+l);
                        }
                    }
                }
            }
        }
        //1--100之间的偶数和
        int sum2 = 0;
        for(int i = 1;i <= 100;i++){
            if(i%2==0){
                sum2 = sum2 + i;
            }
        }
        System.out.println(sum2);
    }
}
