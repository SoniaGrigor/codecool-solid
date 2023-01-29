package org.example.p5_dependency_inversion.bad;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private final List<Developer> developers = new ArrayList<>();

    private final List<Designer> designers = new ArrayList<>();

    private final List<Tester> testers = new ArrayList<>();


    public void addDeveloper(Developer developer) {
        this.developers.add(developer);
    }

    public void addDesigner(Designer designer) {
        this.designers.add(designer);
    }

    public void addTester(Tester tester) {
        this.testers.add(tester);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "developers=" + developers +
                ", designers=" + designers +
                ", testers=" + testers +
                '}';
    }
}
