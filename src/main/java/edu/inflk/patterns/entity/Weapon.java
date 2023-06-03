package edu.inflk.patterns.entity;

import edu.inflk.patterns.template.Equipment;

public class Weapon extends Equipment {


    public Weapon(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
