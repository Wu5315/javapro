package com.wu.pojo;

import com.wu.util.Column1;

public class Student1 {
    private Integer Sno;
    private String Sname;
    @Column1("Ssex")
    private String Sex;
    private Integer Sage;
    private String Sdept;

    public Student1() {
    }

    public Student1(String sname, String ssex, Integer sage, String sdept) {
        Sname = sname;
        Sex = ssex;
        Sage = sage;
        Sdept = sdept;
    }

    public Student1(Integer sno, String sname, String ssex, Integer sage, String sdept) {
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
        return "Student1{" +
                "Sno=" + Sno +
                ", Sname='" + Sname + '\'' +
                ", Sex='" + Sex + '\'' +
                ", Sage=" + Sage +
                ", Sdept='" + Sdept + '\'' +
                '}';
    }
}
