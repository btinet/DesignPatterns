package edu.inflk.patterns.entity;

import edu.inflk.patterns.template.AgentTemplate;
import edu.inflk.patterns.template.VehicleTemplate;

public class Agent extends AgentTemplate
{

    protected String firstname;
    protected String lastname;

    public Agent (String firstname, String lastname, VehicleTemplate car)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.cars.add(car);
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
    public void addCar(VehicleTemplate car)
    {
        this.cars.add(car);
    }

    @Override
    public void removeCar(int index) {
        this.cars.remove(index);
    }

    @Override
    public VehicleTemplate getCar(int index)
    {
        return this.cars.get(index);
    }

}
