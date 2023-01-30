package org.example.p3_liskov_substitution.good;

public class SeniorEmployee implements IWork, IEmployee {
    public String getWorkDetails(Integer employeeId) {
        return "Senior Work";
    }

    public String getEmployeeDetails(Integer employeeId) {
        return "Senior Employee";
    }
}