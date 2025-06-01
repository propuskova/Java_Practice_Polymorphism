package ru.сourses.geometry;

public class Circle implements Shape {
    Point center;
    double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
