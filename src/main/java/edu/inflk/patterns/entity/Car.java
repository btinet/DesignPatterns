package edu.inflk.patterns.entity;

import edu.inflk.patterns.helper.IntegerHelper;
import edu.inflk.patterns.template.Agent;
import edu.inflk.patterns.template.Vehicle;
import edu.inflk.patterns.template.VehicleType;

import java.util.ArrayList;

public class Car extends Vehicle {

    private String licencePlate;

    public Car (Integer seats, Double fuel, Boolean isStarted, Agent driver, ArrayList<Agent> passengers, String licencePlate)
    {
        super(VehicleType.CAR);
        this.setSeats(seats);
        this.setDriver(driver);
        this.setPassengers(passengers);
        this.setFuel(fuel);
        this.hasEngine = true;
        this.setStarted(isStarted);

        if(licencePlate == null)
        {
            this.licencePlate = "B-TK" + IntegerHelper.generateRandomInteger(1000,9999);
        } else {
            this.licencePlate = licencePlate;
        }
    }

    @Override
    public String toString() {
        return this.licencePlate;
    }

    @Override
    public Boolean hasEngine() {
        return super.hasEngine;
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
    public Double getFuel() {
        return super.fuel;
    }

    @Override
    public void setFuel(double fuel) {
        super.fuel = fuel;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

}
