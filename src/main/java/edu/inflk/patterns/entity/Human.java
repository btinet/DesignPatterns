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
        System.out.println("Ich bin ein Mensch und kann reden, fahren und Gegenstände benutzen.");
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
    public void removeCar(int index)
    {
        try
        {
            this.cars.remove(index);
        } catch (IndexOutOfBoundsException ignored)
        {

        }

    }

    @Override
    public Vehicle getCar(int index)
    {
        try
        {
            return this.cars.get(index);
        } catch (IndexOutOfBoundsException exception)
        {
            return null;
        }
    }

    @Override
    public Equipment getEquipment(int index) {
        try
        {
            return this.equipment.get(index);
        } catch (IndexOutOfBoundsException exception)
        {
            return null;
        }
    }

}
