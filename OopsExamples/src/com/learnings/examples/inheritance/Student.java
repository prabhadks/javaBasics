package com.learnings.examples.inheritance;

public class Student extends Person{

    private String college;
    private String year;

    public Student(String name, String college) {
        super(name);
        this.college = college;
    }

    public String getCollege() {
        return college;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
