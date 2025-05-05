package com.learnings.examples.inheritance;

public class Runner {
    public static void main(String[] args) {
        EmployeeBuilder employeeBuilder = new EmployeeBuilder();
        Employee employee = employeeBuilder.setName("Test Employee")
                .setEmail("test@employer.com")
                .setContactNumber("123456789")
                .setTitle("Senior Engineer")
                .setEmployeeGrade("26")
                .setEmployer("Test Employer")
                .setSalary(65000)
                .build();
        System.out.println(employee);
    }
}
