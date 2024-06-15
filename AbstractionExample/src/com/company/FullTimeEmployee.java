package com.company;

public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(String name, int payPerHour) {
        super(name, payPerHour);
    }

    @Override
    public int calculateSalary(int payPerHour) {
        return payPerHour * 8;
    }
}
