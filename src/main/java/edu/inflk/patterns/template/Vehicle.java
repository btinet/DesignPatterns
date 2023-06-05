package edu.inflk.patterns.template;

import java.util.ArrayList;

public abstract class Vehicle {

    private final VehicleType vehicleType;
    protected Boolean isStarted = false;
    protected Boolean hasEngine = false;
    protected Double fuel = 0.0;
    private Integer seats = 1;
    private ArrayList<Agent> passengers = new ArrayList<>(seats);

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

    public Boolean hasEngine() { return false; }

    public void setHasEngine(Boolean hasEngine) {}

    public Double getFuel() { return null; }

    public void setFuel(double fuel) {}

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.passengers = new ArrayList<>(seats);
        this.seats = seats;
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
        if(this.passengers.size() < this.seats)
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

}
