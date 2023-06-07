package edu.inflk.patterns.director;

import edu.inflk.patterns.builder.BoatBuilder;
import edu.inflk.patterns.builder.CarBuilder;
import edu.inflk.patterns.builder.DogBuilder;
import edu.inflk.patterns.builder.HumanBuilder;
import edu.inflk.patterns.entity.Boat;
import edu.inflk.patterns.entity.Car;
import edu.inflk.patterns.entity.TurboBooster;
import edu.inflk.patterns.entity.Weapon;
import edu.inflk.patterns.template.Agent;
import edu.inflk.patterns.template.Vehicle;

public class VehicleDirector {

    public Boat createRaceBoat (BoatBuilder builder)
    {
        builder
                .setSeats(4)
                .setFuel(100.0)
                .setIsStarted(false)
                .setEngine(true)
        ;

        return builder.createBoat();
    }

    public Car createRaceCar (CarBuilder builder)
    {
        builder
                .setSeats(4)
                .setFuel(65.0)
                .setIsStarted(true)
                .setLicencePlate("BO-ND 007")
                .addEquipment(new TurboBooster("Speed Booster X1000"))
                .addEquipment(new Weapon("Bananenwurfmaschine"))
        ;

        return builder.createCar();
    }

}
