package org.example.vehicle.factory;

import org.example.vehicle.Vehicle;
import org.example.vehicle.type.CorvetteStarship;
import org.example.vehicle.type.StarDestroyerStarship;

public class StarshipFactory {
    public Vehicle create(String vehicleType) throws Exception {
        if (vehicleType.equals("CorvetteStarship")) {
            return new CorvetteStarship();
        } else if (vehicleType.equals("StarDestroyerStarship")) {
            return new StarDestroyerStarship();
        } else {
            throw new Exception("No such vehicle type");
        }
    }
}
