package edu.inflk.patterns.entity;

import edu.inflk.patterns.template.AgentType;
import edu.inflk.patterns.template.Agent;
import edu.inflk.patterns.template.Equipment;
import edu.inflk.patterns.template.Vehicle;

import java.util.ArrayList;

public class Human extends Agent
{

    protected String firstname;
    protected String lastname;

    public Human(String firstname, String lastname, ArrayList<Vehicle> vehicles, ArrayList<Equipment> equipment, AgentType agentType)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        super.vehicles = vehicles;
        super.equipment = equipment;
        super.agentType = agentType;
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
    public void addVehicle(Vehicle car)
    {
        this.vehicles.add(car);
    }

    @Override
    public void removeVehicle(int index)
    {
        try
        {
            this.vehicles.remove(index);
        } catch (IndexOutOfBoundsException ignored)
        {

        }

    }

    @Override
    public Vehicle getVehicle(int index)
    {
        try
        {
            return this.vehicles.get(index);
        } catch (IndexOutOfBoundsException exception)
        {
            return null;
        }
    }

    @Override
    public ArrayList<Vehicle> getVehicles()
    {
        return this.vehicles;
    }

    @Override
    public void addEquipment(Equipment equipment)
    {
        this.equipment.add(equipment);
    }

    @Override
    public void removeEquipment(int index)
    {
        try
        {
            this.equipment.remove(index);
        } catch (IndexOutOfBoundsException ignored)
        {

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

    @Override
    public ArrayList<Equipment> getEquipment()
    {
        return this.equipment;
    }



}
