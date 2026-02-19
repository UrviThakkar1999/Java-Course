package com.urvi.oopsConcept.classes;

public class Car {

    private String car = "Tesla";
    private String color = "Red";
    private String model = "y model";
    private int door = 2;
    private boolean convertible = false;

public String getCar(){
    return car;
}

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getDoor() {
        return door;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setCar(String car) {
    this.car = car;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void printData(){
        System.out.println("Car Data" );
        System.out.println("Car Type: " + car);
        System.out.println("Car Color: " + color);
        System.out.println("Car Model: " + model);
        System.out.println("Car Door: " + door);
        System.out.println("Car Convertible: " + convertible);
    }

}

