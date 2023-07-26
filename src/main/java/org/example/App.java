package org.example;

import org.example.pilot.Pilot;
import org.example.vehicle.external.StarshipCommandBus;
import org.example.vehicle.type.Boomer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Pilot pilot = new Pilot("Pilot 1", new Boomer());
//        System.out.println(pilot.getVehicle());
        StarshipCommandBus.fetchAllStarshipsCommand();
        System.out.println("Done");
    }
}
