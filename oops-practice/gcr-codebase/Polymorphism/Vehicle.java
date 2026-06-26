package Polymorphism;

public abstract class Vehicle {
    protected String VehicleNumber;

    public Vehicle (String vehicleNumber){
        VehicleNumber = vehicleNumber;

    }
    // use this in other classes ; eg of polymorph , fuelCost will be used accordingly to different class
    public abstract double fuelCost(double km);
}
