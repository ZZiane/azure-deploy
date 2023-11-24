package org.mql.auth.models;

public class Student {
    private String name;
    private String password;

    private double mark;

    public Student(){

    }


    public Student(String name, String password, double mark) {
        this.name = name;
        this.password = password;
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public void setSucced(double mark) {
        this.mark = mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
