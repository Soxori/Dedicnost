package com.company;

public class Main {
    public static void main(String[] args) {
        final Car car = new Car("McLaren P1", 903);
        final Motorbike motorbike = new Motorbike(" VFR1200F", 167, 230, "race");
        final Ferry ferry = new Ferry("Trajekt305", 11860, "CESKOOOOO", 100);
        System.out.println(car.getName() + "\n" + motorbike.getHorsepower() + "\n" + ferry.getCapacity());
        car.description();
        motorbike.description();
        ferry.description();
    }
}
