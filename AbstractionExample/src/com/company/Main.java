package com.company;
/*
In this example, we create an abstract Employee class
and which contains the abstract calculateSalary() method.
Let the subclasses extend the Employee class and implement a calculateSalary() method.
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        ContractEmployee cm = new ContractEmployee("Test Contractor", 4, 5000);
        System.out.println("Salary of Contract Employee: "+ cm.calculateSalary(cm.getPayPerHour()));
        FullTimeEmployee fm = new FullTimeEmployee("Full Time Employee Test", 4000);
        System.out.println("Salary of Full Time Employee: "+ fm.calculateSalary(fm.getPayPerHour()));

    }
}
