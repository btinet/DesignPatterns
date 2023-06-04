package edu.inflk.patterns.builder;

import edu.inflk.patterns.entity.Human;
import edu.inflk.patterns.template.Equipment;
import edu.inflk.patterns.template.Vehicle;

import java.util.ArrayList;

public class HumanBuilder {
    private String firstname;
    private String lastname;
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private ArrayList<Equipment> equipment = new ArrayList<>();

    public HumanBuilder reset() {
        firstname = null;
        lastname = null;
        vehicles = new ArrayList<>();
        equipment = new ArrayList<>();

        return this;
    }

    public HumanBuilder setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public HumanBuilder setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public HumanBuilder addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
        return this;
    }

    public HumanBuilder addEquipment(Equipment equipment) {
        this.equipment.add(equipment);
        return this;
    }

    public Human createHuman() {
        return new Human(firstname, lastname, vehicles, equipment);
    }

}
