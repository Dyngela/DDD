package org.example.vehicle.type;

import lombok.ToString;
import org.example.vehicle.abilities.AirAbility;
import org.example.vehicle.Vehicle;

@ToString
public class Starship implements AirAbility, Vehicle {
    @Override
    public boolean fly() {
        System.out.println("I can fly");
        return false;
    }

    @Override
    public boolean start() {
        System.out.println("Starting off");
        return false;
    }

    @Override
    public boolean stop() {
        System.out.println("Stoooop");
        return false;
    }
}
