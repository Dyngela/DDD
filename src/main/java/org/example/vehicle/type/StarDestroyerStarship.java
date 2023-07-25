package org.example.vehicle.type;

import lombok.ToString;
import org.example.vehicle.Vehicle;
import org.example.vehicle.abilities.FightAbility;

@ToString
public class StarDestroyerStarship extends Starship {
    public boolean attack(Starship target) {
        System.out.println("Attacking : " + target);
        return true;
    }
}
