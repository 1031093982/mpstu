package com.mp.stu.demo.dao;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("stus")

public class student {
    @TableId
    private String sno;

    private String name;
    private String sex;
    private int age;

    public student() {
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public student(String stuNo, String name, String sex, int age) {
        this.sno = stuNo;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "sno='" + sno + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public String toJson(){
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        sb.append("\"").append("sno").append("\":").append(this.sno);
        sb.append("\"").append("name").append("\":").append(this.name);
        sb.append("\"").append("sex").append("\":").append(this.sex);
        sb.append("\"").append("age").append("\":").append(this.age);
        sb.append("}");
        return sb.toString();
    }
}
