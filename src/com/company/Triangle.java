package com.company;

public class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle() {
    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calculatePerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    public double calculateArea() {
        double semiPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - this.sideA) * (semiPerimeter - this.sideB) * (semiPerimeter - sideC));
    }

    public static boolean checkValidate(Triangle triangle) {
        if (triangle.sideA + triangle.sideB >= triangle.sideC && triangle.sideB + triangle.sideC >= triangle.sideA && triangle.sideA + triangle.sideC >= triangle.sideB)
            return true;
        else return false;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA > 0)
            this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB > 0)
            this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        if (sideC > 0)
            this.sideC = sideC;
    }

}
