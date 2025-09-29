package io.github.OptimusRohan;

import io.github.OptimusRohan.dmvinfo.passenger.ford.FordModel;
import io.github.OptimusRohan.dmvinfo.passenger.ford.Models;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FordModel vehicle = new FordModel(
                "1FTFW1E50JFB12345",
                2018,
                Models.F150);
        System.out.println(vehicle);
    }
}