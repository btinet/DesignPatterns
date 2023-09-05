package edu.inflk.patterns.entity;

import edu.inflk.patterns.helper.IntegerHelper;
import edu.inflk.patterns.template.Agent;
import edu.inflk.patterns.template.Equipment;
import edu.inflk.patterns.template.Vehicle;
import edu.inflk.patterns.template.VehicleType;

import java.util.ArrayList;

public class Car extends Vehicle {

    private final String licencePlate;

    public Car (Integer seats, Double fuel, Boolean isStarted, Agent driver, ArrayList<Agent> passengers, ArrayList<Equipment> equipment, String licencePlate)
    {
        super(VehicleType.CAR);
        this.setSeats(seats);
        this.setDriver(driver);
        this.setPassengers(passengers);
        this.setFuel(fuel);
        setHasEngine(true);
        this.setStarted(isStarted);
        this.equipment = equipment;

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
    public Boolean isStarted() {
        return this.isStarted;
    }

    @Override
    public void setStarted(boolean started) {
        this.isStarted = started;
    }

    @Override
    public Double getFuel() {
        return this.fuel;
    }

    @Override
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean hasEngine() {
        System.out.println("hat nen Motor?" + super.hasEngine());
        return super.hasEngine();
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void addEquipment (Equipment equipment) {
        this.equipment.add(equipment);
    }
    public void removeEquipment (int index) {
        try
        {
            this.equipment.remove(index);
        } catch (IndexOutOfBoundsException exception)
        {
            System.out.println("Platz existiert nicht.");
        }
    }
    public void removeEquipment (Equipment equipment) {
        this.equipment.remove(equipment);
    }
    public Equipment getEquipment (int index) {
        try
        {
            return this.equipment.get(index);
        } catch (IndexOutOfBoundsException exception)
        {
            System.out.println("Platz existiert nicht.");
            return null;
        }
    }
    public ArrayList<Equipment> getEquipment () { return this.equipment;  }

}
