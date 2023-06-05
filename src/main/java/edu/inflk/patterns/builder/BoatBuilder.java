package edu.inflk.patterns.builder;

import edu.inflk.patterns.entity.Boat;
import edu.inflk.patterns.template.Agent;

import java.util.ArrayList;

public class BoatBuilder {
    private Integer seats = 1;
    private Double fuel;
    private Boolean isStarted;
    private Boolean hasEngine;
    private Agent driver;
    private ArrayList<Agent> passengers = new ArrayList<>();
    private String licencePlate;

    public BoatBuilder reset() {
        seats = 1;
        fuel = 0.0;
        isStarted = false;
        passengers = new ArrayList<>(seats);

        return this;
    }

    public BoatBuilder setSeats(Integer seats) {
        this.seats = seats;
        return this;
    }

    public BoatBuilder setFuel(Double fuel) {
        this.fuel = fuel;
        return this;
    }

    public BoatBuilder setIsStarted(Boolean isStarted) {
        this.isStarted = isStarted;
        return this;
    }

    public void setEngine(Boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    public void setDriver(Agent driver) {
        this.driver = driver;
    }

    public BoatBuilder setPassengers(ArrayList<Agent> passengers) {
        this.passengers = passengers;
        return this;
    }

    public BoatBuilder addPassenger(Agent passenger) {
        this.passengers.add(passenger);
        return this;
    }

    public BoatBuilder setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
        return this;
    }

    public Boat createBoat() {
        return new Boat(seats, fuel, isStarted, hasEngine, driver, passengers, licencePlate);
    }
}