package com.company;

public class Circle {

    private int radius;

    public Circle() {

    }

    public Circle(int radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Incorrect radius");
        }
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Incorrect radius");
        }
    }

}
