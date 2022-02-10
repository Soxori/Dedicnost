package com.company;

public class Car {
    final String name;
    final int horsePower;

    public Car(String name, int horsePower) {
        this.name = name;
        this.horsePower = horsePower;
    }
    public String getName() {
        return name;
    }
    public int getHorsepower() {
        return horsePower;
    }
    public void description() {
        System.out.println("A car (or automobile) is a wheeled motor vehicle used for transportation. Most definitions of cars say that they run primarily on roads, seat one to eight people, have four wheels, and mainly transport people rather than goods. ... Cars have controls for driving, parking, passenger comfort, and a variety of lights.");
    }
}
