package org.example.p4_interface_segregation.good;


public class Duck implements FlyingCreature, FeatheredCreature {
    private String currentLocation;
    private Integer numberOfFeathers;

    public void molt() {
        this.numberOfFeathers -= 1;
    }

    public void fly() {
        throw new UnsupportedOperationException();
    }
}
