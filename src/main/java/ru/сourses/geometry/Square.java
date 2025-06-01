package ru.сourses.geometry;

public class Square implements Shape {
    Point topLeft;
    double side;

    public Square(Point topLeft, double side) {
        this.topLeft = topLeft;
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}
