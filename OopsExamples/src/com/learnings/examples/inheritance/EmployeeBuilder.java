package com.learnings.examples.inheritance;

public class EmployeeBuilder {

    private String name;
    private String email;
    private String contactNumber;
    private String title;
    private String employer;
    private String employeeGrade;
    private double salary;

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setEmail(String email) {
        this.email = email;
        return this;
    }
    public EmployeeBuilder setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }
    public EmployeeBuilder setTitle(String title) {
        this.title = title;
        return this;
    }
    public EmployeeBuilder setEmployer(String employer) {
        this.employer = employer;
        return this;
    }
    public EmployeeBuilder setEmployeeGrade(String employeeGrade) {
        this.employeeGrade = employeeGrade;
        return this;
    }
    public EmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public Employee build() {
        Employee employee = new Employee(this.name, this.employer);
        employee.setEmail(this.email);
        employee.setTitle(this.title);
        employee.setContactNumber(this.contactNumber);
        employee.setSalary(this.salary);
        employee.setEmployeeGrade(this.employeeGrade);
        return employee;
    }
}
