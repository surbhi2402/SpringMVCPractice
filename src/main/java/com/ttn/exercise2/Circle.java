package com.ttn.exercise2;

public class Circle {

    public String name;

    public String getName() {
        System.out.println("Get for circle called!");
        return name;
    }

    public void setName(String name) {
        System.out.println("Set for circle called!");
        this.name = name;
    }
}
