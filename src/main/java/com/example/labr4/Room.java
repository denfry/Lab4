package com.example.labr4;

public class Room {
    private final String name;
    private final int area;

    public Room(String name, double area) {
        this.name = name;
        this.area = (int) area;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Помещение: " + name + ", площадь: " + area + " м2";
    }


}
