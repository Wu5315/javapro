package com.wu.test;

public class Mytest1 {
    public static void main(String[] args) {
        //1~~4之间，拿出任意三个数，最多能组成多少个数字，并打印
        int[] array = {1,2,3,4};
        for(int a :array){
            for(int b :array){
                if(a!=b){
                    for(int c : array){
                        if(c!=a && c!=b){
                            System.out.println(a*100+b*10+c);
                        }
                    }
                }
            }
        }



        // 1~~100之间的偶数和
        int sum = 0;
        for(int i = 1;i <= 100;i++){
            if(i%2==0){
                sum = sum +i;
            }
        }
        System.out.println(sum);




        //定义两个int变量 m和n ，计算m的n次方
        int m = 2;
        int n = 10;
        int sum1 = 1;
        for(int i = 1;i <= n;i++){
            sum1 = sum1*m;
        }
        System.out.println(sum1);




        //100~~999之间的水仙花数，如153   1^3+5^3+3^3=153
        for(int i = 100;i <= 999;i++){
            int a = i/100;//   i/100取整得到百位
            int b = i%100/10;//   取余再取整得十位
            int c = i%10;//    I%10取余得个位
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }



        //两个正整数，计算最大公约数和最大公倍数
        int a = 4;
        int b = 6;
        int max = 0;
        //最大公因数
        for(int i = 1;i <= a &&i <= b;i++){
            if(a%i==0 && b%i==0){
                max =  i;
            }
        }
        System.out.println(max);
        //最小公倍数
        int z = 0;
        int mix = 0;
        if(a>b){
            z = b;
        }else{
            z = a;
        }
        for(int i = z;i <= a*b;i++){
            if(i%a==0 && i%b==0){
                mix = i;
                break;
            }
        }
        System.out.println(mix);
    }
}
