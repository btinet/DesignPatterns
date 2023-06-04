package edu.inflk.patterns.entity;

import edu.inflk.patterns.helper.IntegerHelper;
import edu.inflk.patterns.template.Agent;
import edu.inflk.patterns.template.Vehicle;
import edu.inflk.patterns.template.VehicleType;

import java.util.ArrayList;

public class Boat extends Vehicle {

    private final String licencePlate;

    public Boat(Integer seats, Double fuel, Boolean isStarted, ArrayList<Agent> passengers, String licencePlate)
    {
        super(VehicleType.BOAT);
        this.setSeats(seats);
        this.setPassengers(passengers);
        this.setFuel(fuel);
        this.setStarted(isStarted);

        if(licencePlate == null)
        {
            this.licencePlate = "DSV-DE-" + IntegerHelper.generateRandomInteger(1000,9999);
        } else {
            this.licencePlate = licencePlate;
        }

    }

    @Override
    public String toString() {
        return this.licencePlate;
    }

}
