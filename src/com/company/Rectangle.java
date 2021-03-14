package com.company;

public class Rectangle {

    private int height;
    private int width;

    public Rectangle(int height, int width) {
        if (height > 0 && width > 0) {
            this.height = height;
            this.width = width;
        } else {
            System.out.println("Incorrect sides of rectangle");
        }
    }

    public Rectangle() {
    }

    public int calculatePerimeter() {
        return 2 * (this.height + this.width);
    }

    public int calculateArea() {
        return this.height * this.width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Incorrect sides of rectangle");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Incorrect sides of rectangle");
        }
    }
}
