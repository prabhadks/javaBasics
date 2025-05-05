package com.learnings.examples.objectcomposition;

public class CustomerRunner {

    public static void main(String[] args) {
        Address homeAddress = new Address("Test Address 1", "Test Address 2", "RG2");
        Customer customer = new Customer("Tester", homeAddress);
        System.out.println(customer);
        Address workAddress = new Address("Address 1", "Address 2", "RG21");
        customer.setWorkAddress(workAddress);
        System.out.println(customer);
    }
}
