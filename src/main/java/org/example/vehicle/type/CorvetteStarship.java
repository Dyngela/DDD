package org.example.vehicle.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.vehicle.Vehicle;
import org.example.vehicle.abilities.FightAbility;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class CorvetteStarship extends Starship {

    public int countPasssenger() {
        return 20;
    }
}
