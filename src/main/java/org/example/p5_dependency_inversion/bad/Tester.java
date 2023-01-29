package org.example.p5_dependency_inversion.bad;

public class Tester {
    private final String name;

    private final Short age;

    public Tester(String name, Short age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
