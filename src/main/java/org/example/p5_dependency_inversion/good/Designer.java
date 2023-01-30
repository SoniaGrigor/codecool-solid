package org.example.p5_dependency_inversion.good;

import lombok.Data;

@Data
public class Designer implements Employee {
    private final String name;

    private final Short age;

    public Designer(String name, Short age) {
        this.name = name;
        this.age = age;
    }

    public void work() {
        System.out.println("turning lines to wireframes");
    }
}
