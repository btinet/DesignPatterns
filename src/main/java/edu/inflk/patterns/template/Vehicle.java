package edu.inflk.patterns.template;

import java.util.ArrayList;

public abstract class Vehicle {

    private final VehicleType vehicleType;
    protected Boolean isStarted = false;
    protected boolean hasEngine;
    protected Double fuel = 0.0;
    private Integer seats = 1;
    private Agent driver;
    private ArrayList<Agent> passengers = new ArrayList<>(seats);
    protected ArrayList<Equipment> equipment = new ArrayList<>();

    public Vehicle (VehicleType vehicleType)
    {
        this.vehicleType = vehicleType;
    }

    public abstract String toString ();

    public VehicleType getVehicleType ()
    {
        return this.vehicleType;
    }

    public Boolean isStarted() { return false; }

    public void setStarted(boolean started) {}

    public boolean hasEngine() {
        return this.hasEngine;
    }

    public void setHasEngine(boolean hasEngine) { this.hasEngine = hasEngine; }

    public Double getFuel() { return null; }

    public void setFuel(double fuel) {}

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.passengers = new ArrayList<>(seats-1);
        this.seats = seats;
    }

    public Agent getDriver() {
        return driver;
    }

    public void setDriver(Agent driver) {
        this.driver = driver;
    }

    public ArrayList<Agent> getPassengers()
    {
        return this.passengers;
    }

    public Agent getPassenger(int index)
    {
        try {
            return this.passengers.get(index);
        } catch (IndexOutOfBoundsException exception)
        {
            System.out.println("Sitzplatz existiert nicht.");
            return null;
        }
    }

    public void setPassengers(ArrayList<Agent> passengers) {
        this.passengers = passengers;
    }
    public void addPassenger(Agent passenger) {
        if(this.passengers.size() < this.seats-1)
        {
            this.passengers.add(passenger);
        }
    }

    public void setPassenger(int index, Agent passenger)
    {
        try
        {
            this.passengers.set(index,passenger);
        } catch (IndexOutOfBoundsException exception)
        {
            System.out.println("Sitzplatz existiert nicht!");
        }
    }

    public void removePassenger(int index)
    {
        try
        {
            this.passengers.remove(index);
        } catch (IndexOutOfBoundsException exception)
        {
            System.out.println("Sitzplatz existiert nicht!");
        }
    }

    public void removePassenger(Agent passenger)
    {
        this.passengers.remove(passenger);
    }

    public void addEquipment (Equipment equipment) {}
    public void removeEquipment (int index) {}
    public void removeEquipment (Equipment equipment) {}
    public Equipment getEquipment (int index) { return null; }
    public ArrayList<Equipment> getEquipment () { return new ArrayList<>();  }

}
