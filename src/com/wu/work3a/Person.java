package com.wu.work3a;

public class Person {
    private String num;
    private String pai;
    public  Person(String num,String pai){
        this.num = num;
        this.pai = pai;
    }
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }
}
