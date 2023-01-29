package org.example.p5_dependency_inversion.bad;

public class Designer {
    private final String name;

    private final Short age;

    public Designer(String name, Short age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Designer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
