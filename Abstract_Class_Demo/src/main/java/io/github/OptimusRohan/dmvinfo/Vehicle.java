package io.github.OptimusRohan.dmvinfo;

public abstract class Vehicle {
    private final String vin;
    private final int manufactureYear;
    private final VehicleTypes vehicleType;

    public Vehicle(String vin, int manufactureYear, VehicleTypes vehicleType) {
        this.vin = vin;
        this.manufactureYear = manufactureYear;
        this.vehicleType = vehicleType;
    }

    public String getVin() {
        return vin;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public VehicleTypes getVehicleType() {
        return vehicleType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicle Information:\n");
        sb.append("VIN: ").append(this.vin).append("\n");
        sb.append("Manufacture Year: ").append(this.manufactureYear).append("\n");
        sb.append("Vehicle Type: ").append(this.vehicleType).append("\n");
        return sb.toString();
    }

}
