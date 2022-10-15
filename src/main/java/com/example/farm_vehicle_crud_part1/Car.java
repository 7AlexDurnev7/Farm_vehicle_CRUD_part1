package com.example.farm_vehicle_crud_part1;

public class Car {
    protected int id;
    protected String nameCar;
    protected String model;
    protected int year;
    protected double price;

    public Car () {
    }

    public Car (int id) {
        this.id = id;
    }

    public Car(int id, String name, String model, int year, double price) {
        this.id = id;
        this.nameCar = name;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car(String name, String model, int year, double price) {
        this.nameCar = name;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
