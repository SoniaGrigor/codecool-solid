package org.example.p5_dependency_inversion.good;

import lombok.Data;

@Data
public class Tester implements Employee {
    private final String name;

    private final Short age;

    public Tester(String name, Short age) {
        this.name = name;
        this.age = age;
    }

    public void work() {
        System.out.println("testing everything out there");
    }
}
