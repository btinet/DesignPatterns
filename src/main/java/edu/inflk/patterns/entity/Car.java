package edu.inflk.patterns.entity;

import edu.inflk.patterns.helper.IntegerHelper;
import edu.inflk.patterns.template.Agent;
import edu.inflk.patterns.template.Equipment;
import edu.inflk.patterns.template.Vehicle;
import edu.inflk.patterns.template.VehicleType;

import java.util.ArrayList;

public class Car extends Vehicle {

    private String licencePlate;

    public Car (Integer seats, Double fuel, Boolean isStarted, Agent driver, ArrayList<Agent> passengers, ArrayList<Equipment> equipment, String licencePlate)
    {
        super(VehicleType.CAR);
        this.setSeats(seats);
        this.setDriver(driver);
        this.setPassengers(passengers);
        this.setFuel(fuel);
        this.hasEngine = true;
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
