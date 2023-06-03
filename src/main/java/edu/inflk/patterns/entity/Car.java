package edu.inflk.patterns.entity;

import edu.inflk.patterns.helper.IntegerHelper;
import edu.inflk.patterns.template.VehicleTemplate;

public class Car extends VehicleTemplate {

    private String licencePlate;

    public Car ()
    {
        this.licencePlate = "B-TK" + IntegerHelper.generateRandomInteger(1000,9999);
    }

    public Car (String licencePlate)
    {
        this.licencePlate = licencePlate;
    }

    @Override
    public String toString() {
        return this.licencePlate;
    }

}
