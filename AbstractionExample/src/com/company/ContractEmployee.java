package com.company;

public class ContractEmployee extends Employee{
    int numberOfHours;

    public ContractEmployee(String name, int numberOfHours, int payPerHour){
        super(name, payPerHour);
        this.numberOfHours = numberOfHours;
    }

    @Override
    public int calculateSalary(int payPerHour) {
        return numberOfHours * payPerHour;
    }
}
