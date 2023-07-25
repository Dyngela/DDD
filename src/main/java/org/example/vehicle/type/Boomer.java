package org.example.vehicle.type;

import lombok.ToString;
import org.example.vehicle.abilities.FightAbility;
import org.example.vehicle.Vehicle;

@ToString
public class Boomer implements FightAbility, Vehicle {
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
    @Override
    public boolean shoot() {
        System.out.println("I can shoot");
        return false;
    }
}
