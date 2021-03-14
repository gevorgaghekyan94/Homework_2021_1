package com.company;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distance() {
        return (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public int distance(Point first, Point second) {
        int xBeetwen = 0;
        int yBeetwen = 0;
        if (second.x >= first.x) {
            xBeetwen = second.x - first.x;
        } else {
            xBeetwen = first.x - second.x;
        }
        if (second.y >= first.y) {
            yBeetwen = second.y - first.y;
        } else {
            yBeetwen = first.y - second.y;
        }
        return (int) Math.sqrt(Math.pow(xBeetwen, 2) + Math.pow(yBeetwen, 2));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
