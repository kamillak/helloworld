package com.company;

public class Point {
    private int x, y;  //create local variables

    public Point(int x, int y) {   //create public for the general access
        this.x = x;
        this.y = y;
    }

    public int getX() {   //to return values
        return x;
    }

    public void setX(int x) {    //to set values
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double dist(Point point) {   //our math method for get distances between points with math formula
        return Math.sqrt(Math.pow(getX() - point.getX(), 2) + Math.pow(getY() - point.getY(), 2));
    }
}