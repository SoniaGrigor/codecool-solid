package org.example.p4_interface_segregation.good;

public class Penguin implements SwimmingCreature, FeatheredCreature {
    private String currentLocation;
    private Integer numberOfFeathers;

    public void molt() {
        this.numberOfFeathers -= 1;
    }

    public void swim() {
        this.currentLocation = "in the water";
    }
}
