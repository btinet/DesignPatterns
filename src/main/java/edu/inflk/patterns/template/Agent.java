package edu.inflk.patterns.template;

import java.util.ArrayList;

public abstract class Agent {

    // Attribute

    protected ArrayList<Vehicle> vehicles = new ArrayList<>();
    protected ArrayList<Equipment> equipment = new ArrayList<>();

    // Pflichtmethoden

    /**
     * Methode zum Ausführen von Aktionen, je nach Agent
     */
    public abstract void doAction ();

    /**
     * Methode, die eine Bezeichnung, einen Namen oder Spitznamen zurückgibt
     * @return Name des Agenten
     */
    public abstract String toString ();

    // Optionale Methoden

    public void addVehicle (Vehicle car) {}
    public void removeVehicle (int index) {}
    public Vehicle getVehicle (int index) { return null; }
    public ArrayList<Vehicle> getVehicles () { return new ArrayList<>(); }

    public void addEquipment (Equipment equipment) {}
    public void removeEquipment (int index) {}
    public void removeEquipment (Equipment equipment) {}
    public Equipment getEquipment (int index) { return null; }
    public ArrayList<Equipment> getEquipment () { return new ArrayList<>();  }

    // Allgemeine Methoden



}
