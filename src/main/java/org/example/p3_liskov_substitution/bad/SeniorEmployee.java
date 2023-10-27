package org.example.p3_liskov_substitution.bad;

public class SeniorEmployee extends Employee {
    @Override
    public String getWorkDetails(Integer employeeId) {
        return "Senior Work";
    }

    @Override
    public String getEmployeeDetails(Integer employeeId) {
        return "Senior Employee";
    }
}