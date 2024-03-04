package Bt01;

import Bt01.Shape;

public class Circle extends Shape {


    private Double radius;

    public Circle(String color) {
        super(color);
    }

    public Circle(String color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * this.radius * this.radius;
    }

}
