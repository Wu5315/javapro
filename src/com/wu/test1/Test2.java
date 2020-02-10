package com.wu.test1;

public class Test2 {
    public static void main(String[] args) {
        //计算m的n次方
        int m = 2;
        int n = 10;
        int sum = 1;
        for(int i = 1;i <= 10;i++){
            sum = sum * m;
        }
        System.out.println(sum);
        //100-999之间的水仙花数
        for(int i = 100;i <= 999;i++){
            int a = i/100;
            int b = (i%100)/10;
            int c = i%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }
        //最大公因数和最小公倍数
        int a = 4;
        int b = 6;
        int max = 0;
        //最大公因数
        for(int i = 2;i <= a && i <= b;i++){
            if(a%i==0 && b%i==0){
                max = i;
            }
        }
        System.out.println(max);
        //最小公倍数
        int mix;
        if(a>b){
            mix = a;
        }else{
            mix = b;
        }
        for(int i = mix;i <= a*b;i++){
            if(i%a==0 && i%b==0){
                System.out.println(i);
                break;
            }
        }



    }
}
