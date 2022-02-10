package com.company;

public class Motorbike extends Car{
    final int maxSpeed;
    final String type;

    public Motorbike(String name, int horsePower, int maxSpeed, String type){
        super(name, horsePower);
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
    public int getCubicCapacity() {
        return maxSpeed;
    }
    public String getType() {
        return type;
    }
    @Override
    public void description() {
        System.out.println("A motorcycle (or motorbike) is a vehicle used to transport people from one place to another. It does not have 4 wheels like a car. It has 2 wheels like a bicycle. But it has a motor like a car. ... Since motorcycles can be lighter than cars, they can accelerate more quickly.");
    }
}
