package com.learnings.examples.inheritance;

public class Employee extends Person{

    private String title;
    private String employer;
    private String employeeGrade;
    private double salary;

    public Employee(String name, String employer) {
        super(name);
        this.employer = employer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employer;
    }

    public String getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(String employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return String.format("name: %s, email: %s, contact: %s, title: %s, employer: %s, employer grade: %s, salary: %s",
                super.getName(), getEmail(), getContactNumber(), getTitle(), getEmployer(), getEmployeeGrade(), getSalary());
    }
}
