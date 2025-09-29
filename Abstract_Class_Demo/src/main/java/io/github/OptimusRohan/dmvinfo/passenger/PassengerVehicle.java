package io.github.OptimusRohan.dmvinfo.passenger;

import io.github.OptimusRohan.dmvinfo.Vehicle;
import io.github.OptimusRohan.dmvinfo.VehicleTypes;

public abstract class PassengerVehicle extends Vehicle {
    private final Makes make;

    public PassengerVehicle(String vin,
                            int manufactureYear,
                            Makes make
    ) {
        super(
                vin,
                manufactureYear,
                VehicleTypes.PASSENGER
        );
        this.make = make;
    }

    public Makes getMake() {
        return make;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Make: ").append(this.make).append("\n");
        return sb.toString();
    }



}
