package edu.inflk.patterns.entity;

import edu.inflk.patterns.template.Agent;
import edu.inflk.patterns.template.Equipment;
import edu.inflk.patterns.template.Vehicle;

import java.util.ArrayList;

public class Human extends Agent
{

    protected String firstname;
    protected String lastname;

    public Human(String firstname, String lastname, Vehicle car, ArrayList<Equipment> equipment)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.cars.add(car);
        this.equipment = equipment;
    }


    // Die folgenden zwei Methoden müssen zwanghaft implementiert werden
    @Override
    public void doAction()
    {
        System.out.println("Ich bin ein Agent und kann reden.");
    }

    @Override
    public String toString() {
        return this.firstname + " " + this.lastname;
    }


    // Agent darf Autos fahren, also implementieren wir den Code dafür
    @Override
    public void addCar(Vehicle car)
    {
        this.cars.add(car);
    }

    @Override
    public void removeCar(int index) {
        this.cars.remove(index);
    }

    @Override
    public Vehicle getCar(int index)
    {
        return this.cars.get(index);
    }

    @Override
    public Equipment getEquipment(int index) {
        return this.equipment.get(index);
    }

}
