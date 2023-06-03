package edu.inflk.patterns.template;

import java.util.ArrayList;

public abstract class AgentTemplate {

    // Attribute

    protected ArrayList<VehicleTemplate> cars = new ArrayList<>();;

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

    public void addCar (VehicleTemplate car) {}
    public void removeCar (int index) {}
    public VehicleTemplate getCar (int index) { return null; }

    // Allgemeine Methoden



}
