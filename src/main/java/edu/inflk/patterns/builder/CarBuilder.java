package edu.inflk.patterns.builder;

import edu.inflk.patterns.entity.Car;
import edu.inflk.patterns.template.Agent;
import edu.inflk.patterns.template.Equipment;

import java.util.ArrayList;

public class CarBuilder {
    private Integer seats = 1;
    private Double fuel = 0.0;
    private Boolean isStarted = false;
    private Agent driver;
    private ArrayList<Agent> passengers = new ArrayList<>(0);
    private ArrayList<Equipment> equipment = new ArrayList<>();
    private String licencePlate;

    public CarBuilder reset() {
        seats = 1;
        fuel = 0.0;
        isStarted = false;
        passengers = new ArrayList<>(0);

        return this;
    }

    public CarBuilder setSeats(Integer seats) {
        this.seats = seats;
        return this;
    }

    public CarBuilder setFuel(Double fuel) {
        this.fuel = fuel;
        return this;
    }

    public CarBuilder setIsStarted(Boolean isStarted) {
        this.isStarted = isStarted;
        return this;
    }

    public CarBuilder setDriver(Agent driver) {
        this.driver = driver;
        return this;
    }

    public CarBuilder setPassengers(ArrayList<Agent> passengers) {
        this.passengers = passengers;
        return this;
    }

    public CarBuilder addPassenger(Agent passenger) {
        this.passengers.add(passenger);
        return this;
    }

    public CarBuilder setEquipment(ArrayList<Equipment> equipment) {
        this.equipment = equipment;
        return this;
    }

    public CarBuilder addEquipment(Equipment equipment) {
        this.equipment.add(equipment);
        return this;
    }

    public CarBuilder setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
        return this;
    }

    public Car createCar() {
        return new Car(seats, fuel, isStarted, driver, passengers, equipment, licencePlate);
    }
}