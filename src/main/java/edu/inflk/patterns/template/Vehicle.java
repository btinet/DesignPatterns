package edu.inflk.patterns.template;

public abstract class Vehicle {

    private final VehicleType vehicleType;

    public Vehicle (VehicleType vehicleType)
    {
        this.vehicleType = vehicleType;
    }

    public abstract String toString ();

    public VehicleType getVehicleType ()
    {
        return this.vehicleType;
    }

}
