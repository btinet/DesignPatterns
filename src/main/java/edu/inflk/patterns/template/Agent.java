package edu.inflk.patterns.template;

import java.util.ArrayList;

public abstract class Agent {

    // Attribute

    protected ArrayList<Vehicle> cars = new ArrayList<>();

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

    public void addCar (Vehicle car) {}
    public void removeCar (int index) {}
    public Vehicle getCar (int index) { return null; }

    public void addEquipment (Equipment car) {}
    public void removeEquipment (int index) {}
    public Equipment getEquipment (int index) { return null; }

    // Allgemeine Methoden



}
