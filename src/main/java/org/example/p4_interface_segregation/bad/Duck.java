package org.example.p4_interface_segregation.bad;

import lombok.Data;

@Data
public class Duck implements Bird {
    private String currentLocation;
    private Integer numberOfFeathers;

    public void molt() {
        this.numberOfFeathers -= 1;
    }

    public void fly() {
        throw new UnsupportedOperationException();
    }

    public void swim() {
        this.currentLocation = "in the water";
    }
}
