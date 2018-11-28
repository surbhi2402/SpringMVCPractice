package com.ttn;

import org.springframework.beans.factory.annotation.Required;

public class Database {

    private int port;
    private String name;

    public int getPort() {
        return port;
    }

    @Required
    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public void test(){
        System.out.println("Inside Test Method!");
        System.out.println("PORT: "+getPort()+" NAME: "+getName());
    }
}
