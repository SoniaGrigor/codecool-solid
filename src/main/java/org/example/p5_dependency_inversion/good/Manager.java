package org.example.p5_dependency_inversion.good;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Manager {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }
}
