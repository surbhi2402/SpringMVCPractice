package com.ttn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Restaurant {

    @Autowired
    Tea tea;

    public Tea getTea() {
        return tea;
    }

    public void setTea(Tea tea) {
        this.tea = tea;
    }

    /*@Autowired
    public Restaurant(Tea tea) {
        this.tea = tea;
    }*/

    public void printTeaDetails() {
        getTea().prepareHotDrink();
    }

    /*HotDrink hotDrink;

    *//*public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }*//*

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public void printTeaDetails() {
        getHotDrink().prepareHotDrink();
    }*/

}
