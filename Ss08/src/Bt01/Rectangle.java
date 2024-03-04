package Bt01;

import Bt01.Shape;

public class Rectangle extends Shape {

    private Double width;
    private Double height;

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(String color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double getArea() {
        return this.height * this.width;
    }
}
