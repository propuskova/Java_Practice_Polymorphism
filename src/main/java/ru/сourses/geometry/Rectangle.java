package ru.сourses.geometry;

class Rectangle implements Shape {
    Point topLeft;
    double width, height;

    public Rectangle(Point topLeft, double width, double height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}
