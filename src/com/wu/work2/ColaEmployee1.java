package com.wu.work2;

public abstract class ColaEmployee1 {
    private String name;
    private int month;

    public ColaEmployee1(String name) {
        this.name = name;
    }

    public abstract double getSalary();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
