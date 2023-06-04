package edu.inflk.patterns.entity;

import edu.inflk.patterns.helper.IntegerHelper;
import edu.inflk.patterns.template.Vehicle;
import edu.inflk.patterns.template.VehicleType;

public class Boat extends Vehicle {

    private final String licencePlate;

    public Boat()
    {
        super(VehicleType.BOAT);
        this.licencePlate = "DSV-DE-" + IntegerHelper.generateRandomInteger(1000,9999);
    }

    public Boat(String licencePlate)
    {
        super(VehicleType.BOAT);
        this.licencePlate = licencePlate;
    }

    @Override
    public String toString() {
        return this.licencePlate;
    }

}
