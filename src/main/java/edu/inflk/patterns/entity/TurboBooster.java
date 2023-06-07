package edu.inflk.patterns.entity;

import edu.inflk.patterns.template.Equipment;

public class TurboBooster extends Equipment {


    public TurboBooster(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
