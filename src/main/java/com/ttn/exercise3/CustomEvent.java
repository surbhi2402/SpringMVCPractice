package com.ttn.exercise3;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source) {
        super(source);
    }

    public String toString() {
        return "Connect Event Called for Database class!!";
    }
}
