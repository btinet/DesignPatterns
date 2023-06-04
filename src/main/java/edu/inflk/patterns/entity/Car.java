package edu.inflk.patterns.entity;

import edu.inflk.patterns.helper.IntegerHelper;
import edu.inflk.patterns.template.Vehicle;
import edu.inflk.patterns.template.VehicleType;

public class Car extends Vehicle {

    private String licencePlate;

    public Car ()
    {
        super(VehicleType.CAR);
        this.licencePlate = "B-TK" + IntegerHelper.generateRandomInteger(1000,9999);
    }

    public Car (String licencePlate)
    {
        super(VehicleType.CAR);
        this.licencePlate = licencePlate;
    }

    @Override
    public String toString() {
        return this.licencePlate;
    }

}
