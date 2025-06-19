package com.murtuza.student_management_app;

public class Student {

    private static int admnNo;

    private String name;

    private int age;

    private String email;

    private String mobileNo;

    private String course;

    public Student() {
    }

    public Student(int admnNo, String name, int age, String email, String mobileNo, String course) {
        this.admnNo = admnNo;
        this.name = name;
        this.age = age;
        this.email = email;
        this.mobileNo = mobileNo;
        this.course = course;
    }
    public static int getAdmnNo(){
        return  admnNo;
    }

    public void setAdmnNo(int admnNo) {
        this.admnNo = admnNo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
