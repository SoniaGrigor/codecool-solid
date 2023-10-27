package org.example.p5_dependency_inversion.bad;

public class Developer {
    private final String name;

    private final Short age;

    public Developer(String name, Short age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
