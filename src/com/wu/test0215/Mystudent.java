package com.wu.test0215;

import java.io.Serializable;

public class Mystudent implements Serializable {
        private static final long serialVersionUID = 2L;
        private String name;
        private Integer age;
        private String sex;
        private String classname;

        public Mystudent (String name, Integer age, String sex, String classname) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.classname = classname;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getClassname() {
            return classname;
        }

        public void setClassname(String classname) {
            this.classname = classname;
        }

        @Override
        public String toString() {
            return "student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex='" + sex + '\'' +
                    ", classname='" + classname + '\'' +
                    '}';
        }

}
