package org.example.p3_liskov_substitution.good;


public class JuniorEmployee implements IEmployee {
    public String getEmployeeDetails(Integer employeeId) {
        return "Junior Employee";
    }
}
