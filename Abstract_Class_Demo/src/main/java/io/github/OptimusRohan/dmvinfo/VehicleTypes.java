package io.github.OptimusRohan.dmvinfo;

public enum VehicleTypes {
    PASSENGER("Passenger"),
    MOTORCYCLE("Motorcycle"),
    BOAT("Boat"),
    TRAILER("Trailer");

    private final String displayName;

    VehicleTypes(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
