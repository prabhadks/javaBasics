package com.company;

public abstract class Employee {
    private String name;
    private int payPerHour;
    private int numberOfHours;

    public Employee(String name, int payPerHour){
        this.name = name;
        this.payPerHour = payPerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(int payPerHour) {
        this.payPerHour = payPerHour;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public abstract int calculateSalary(int payPerHour);
}
