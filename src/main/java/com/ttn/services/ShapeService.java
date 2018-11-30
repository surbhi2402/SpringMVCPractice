package com.ttn.services;

import com.ttn.exercise2.Circle;
import com.ttn.exercise2.Triangle;

public class ShapeService {

    public Circle circle;

    public Triangle triangle;

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}
