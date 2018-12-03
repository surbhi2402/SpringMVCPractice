package com.ttn.exercise3;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Database implements ApplicationEventPublisherAware {

    int port;
    String name;
    private ApplicationEventPublisher publisher;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void connect() {
        System.out.println("Database connect method called!");
        CustomEvent customEvent = new CustomEvent(this);
        publisher.publishEvent(customEvent);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }
}
