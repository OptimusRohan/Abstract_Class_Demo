package io.github.OptimusRohan;

import io.github.OptimusRohan.dmvinfo.passenger.ford.FordModel;
import io.github.OptimusRohan.dmvinfo.passenger.ford.Models;

public class Main {
    public static void main(String[] args) {
        FordModel vehicle = new FordModel(
                "1FTFW1E50JFA12345",
                2018,
                Models.F150
        );
        System.out.println(vehicle);
    }
}