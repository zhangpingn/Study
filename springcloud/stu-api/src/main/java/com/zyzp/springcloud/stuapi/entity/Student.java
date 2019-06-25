package com.zyzp.springcloud.stuapi.entity;


public class Student {
    private String sid;
    private String sname;
    private Integer age;
    private Double score;

    public Student() {
    }

    public Student(String sid, String sname, Integer age, Double score) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.score = score;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
