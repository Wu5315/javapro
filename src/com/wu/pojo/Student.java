package com.wu.pojo;

import com.wu.util.Column;

public class Student {
    private Integer Sno;
    private String Sname;
    @Column("Ssex")
    private String Sex;
    private Integer Sage;
    private String Sdept;

    public Student() {
    }

    public Student(String sname, String ssex, Integer sage, String sdept) {
        Sname = sname;
        Sex = ssex;
        Sage = sage;
        Sdept = sdept;
    }

    public Student(Integer sno, String sname, String ssex, Integer sage, String sdept) {
        Sno = sno;
        Sname = sname;
        Sex = ssex;
        Sage = sage;
        Sdept = sdept;
    }

    public Integer getSno() {
        return Sno;
    }

    public void setSno(Integer sno) {
        Sno = sno;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public String getSsex() {
        return Sex;
    }

    public void setSsex(String ssex) {
        Sex = ssex;
    }

    public Integer getSage() {
        return Sage;
    }

    public void setSage(Integer sage) {
        Sage = sage;
    }

    public String getSdept() {
        return Sdept;
    }

    public void setSdept(String sdept) {
        Sdept = sdept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sno=" + Sno +
                ", Sname='" + Sname + '\'' +
                ", Ssex='" + Sex + '\'' +
                ", Sage=" + Sage +
                ", Sdept='" + Sdept + '\'' +
                '}';
    }
}
