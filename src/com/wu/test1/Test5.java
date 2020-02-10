package com.wu.test1;

public class Test5 {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        int r = a%b;
        return gcd(b,r);
    }
    public static void main(String[] args) {
        int a = 8;
        int b = 12;
        System.out.println(Test5.gcd(a,b));
    }
}
