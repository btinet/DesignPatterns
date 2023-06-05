package edu.inflk.patterns.entity;

import edu.inflk.patterns.helper.IntegerHelper;
import edu.inflk.patterns.template.Agent;
import edu.inflk.patterns.template.Vehicle;
import edu.inflk.patterns.template.VehicleType;

import java.util.ArrayList;

public class Boat extends Vehicle {

    private final String licencePlate;

    public Boat(Integer seats, Double fuel, Boolean isStarted, Boolean hasEngine, Agent driver, ArrayList<Agent> passengers, String licencePlate)
    {
        super(VehicleType.BOAT);
        this.setSeats(seats);
        this.setDriver(driver);
        this.setPassengers(passengers);
        if(hasEngine)
        {
            this.setFuel(fuel);
            this.hasEngine = true;
            this.setStarted(isStarted);
        }

        if(licencePlate == null)
        {
            this.licencePlate = "DSV-DE-" + IntegerHelper.generateRandomInteger(1000,9999);
        } else {
            this.licencePlate = licencePlate;
        }

    }

    @Override
    public Boolean isStarted() {
        return super.isStarted;
    }

    @Override
    public void setStarted(boolean started) {
        super.isStarted = started;
    }

    @Override
    public Boolean hasEngine() {
        return super.hasEngine;
    }

    @Override
    public Double getFuel() {
        return super.fuel;
    }

    @Override
    public void setFuel(double fuel) {
        super.fuel = fuel;
    }

    @Override
    public String toString() {
        return this.licencePlate;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

}
