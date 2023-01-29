package org.example.p3_liskov_substitution.bad;

public class JuniorEmployee extends Employee {
    @Override
    public String getWorkDetails(Integer employeeId) {
        throw new UnsupportedOperationException("There is no information for Junior’s");
    }

    @Override
    public String getEmployeeDetails(Integer employeeId) {
        return "Junior Employee";
    }
}
