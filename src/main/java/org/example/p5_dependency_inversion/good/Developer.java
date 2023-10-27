package org.example.p5_dependency_inversion.good;

import lombok.Data;

@Data
public class Developer implements Employee {
    private final String name;

    private final Short age;

    public Developer(String name, Short age) {
        this.name = name;
        this.age = age;
    }

    public void work() {
        System.out.println("turning coffee into code");
    }
}
