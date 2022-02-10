package com.company;

public class Ferry extends  Car{
    final String country;
    final int capacity;

    public Ferry(String name, int horsePower, String country, int capacity) {
        super(name, horsePower);
        this.country = country;
        this.capacity = capacity;
    }
    public String getCountry() {
        return country;
    }
    public int getCapacity() {
        return capacity;
    }
    @Override
    public void description() {
        System.out.println("ferry, a place where passengers, freight, or vehicles are carried by boat across a river, lake, arm of the sea, or other body of water. ... Ferries include a wide variety of vessels, from the simplest canoes or rafts to large motor-driven ferries capable of carrying trucks and railway cars across vast expanses of water.");
    }
}
