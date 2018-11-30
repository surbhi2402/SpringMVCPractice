package com.ttn.exercise2;

public class Triangle {

    public String name;

    public String getName() {
        System.out.println("Get for triangle called!");
        return name;
    }

    public void setName(String name) {
        System.out.println("Set for triangle called!");
        this.name = name;
    }
}
