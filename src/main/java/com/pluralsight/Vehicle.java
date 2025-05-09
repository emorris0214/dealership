package com.pluralsight;

public class Vehicle {
    private int vin;
    private int year;
    private int odometer;
    private double price;
    private String make;
    private String model;
    private String vehicleType;
    private String color;

    public Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

}