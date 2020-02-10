package com.wu.test;

public class Mytest4 {
    public static void main(String[] args) {
//        I5 i5 = new I5();
//        I3 i3 = new I3();
//        Mainboard mainboard = new Mainboard();
//        mainboard.setI5(i5);
//        mainboard.methods();
         I5 i5 = new I5();
         I3 i3 = new I3();
         I7 i7 = new I7();
         I9 i9 = new I9();
         Mainboard mainboard = new Mainboard();
         mainboard.setCpu(i3);
         mainboard.setCpu2(i9);
         mainboard.method();
         mainboard.methods();
    }
}
