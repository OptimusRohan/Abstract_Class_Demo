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

    // toString with tabCount for printing in a clean way
    public String toString(int tabCount) {
        String tabs = "\t".repeat(tabCount);
        StringBuilder sb = new StringBuilder();
        sb.append(tabs)
            .append("Vehicle Category: ")
            .append(displayName)
            .append("\n");
        return sb.toString();
    }
    // call the toString with 0 tabs
    @Override
    public String toString() {
        return toString(0);
    }
}
