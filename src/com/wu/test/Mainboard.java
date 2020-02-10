package com.wu.test;

public class Mainboard {
    private Cpu cpu;
    private Cpu2 cpu2;
//    public Mainboard(Cpu2 cpu2){
//        this.cpu2 = cpu2;
//    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
    public void setCpu2(Cpu2 cpu2) {
        this.cpu2 = cpu2;
    }
    public void method(){
        this.cpu.method();
    }
    public void methods(){
        this.cpu2.methods();
    }
    //    private I3 i3;
//    private I5 i5;
//
//    public I5 getI5() {
//        return i5;
//    }
//
//    public void setI5(I5 i5) {
//        this.i5 = i5;
//    }
//
//    public I3 getI3() {
//        return i3;
//    }
//
//    public void setI3(I3 i3) {
//        this.i3 = i3;
//    }
//    public void method(){
//        this.i3.method();
//    }
//    public void methods(){
//        this.i5.method();
//    }
}
