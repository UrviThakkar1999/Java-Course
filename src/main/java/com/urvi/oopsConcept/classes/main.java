package com.urvi.oopsConcept.classes;

public class main {

    public static void main(String[] args) {

        Car car = new Car();

        car.setCar("Tesla");
        car.setColor("red");
        car.setConvertible(true);
        car.setModel("Model X");
        car.setDoor(4);

        System.out.println("car type = "+ car.getCar());
        System.out.println("car color = "+ car.getColor());
        System.out.println("car model = "+ car.getModel());
        System.out.println("car door = "+ car.getDoor());
        System.out.println("car convertible = "+car.isConvertible());

        System.out.println();
        car.printData();
    }

}
