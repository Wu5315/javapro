package com.wu.test;

public class Mytest9 {
    public static void main(String[] args) {
//        MyInterface add = new MyAdd();
//        MyInterface jian = new MyJian();
//        MyInterface cheng = new Mycheng();
//        MyInterface chu = new Mychu();
//        MyInterface jisuan = new MyInterface() {
//            @Override
//            public int method(int a, int b) {
//                return a-b;
//            }
//        };
//        System.out.println(method(10,2,jisuan));
//        System.out.println(method(10, 2, new MyInterface() {
//            @Override
//            public int method(int a, int b) {
//                return a+b;
//            }
//        }));
        System.out.println(method(10,2,(a,b)->{
            return a+b;
        }));
    }
    public static int method(int a,int b,MyInterface myInterface){
        return myInterface.method(a,b);
    }
}
