package com.jonasrosendo.recyclerview.model;

public class Student {

    private String RA;
    private String name;
    private int age;
    private String phone;

    public Student() {
    }

    public Student(String RA, String name, int age, String phone) {
        this.RA = RA;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
