package ru.сourses.geometry;

public class ColoredPoint extends CoordinatePoint {
    private final String color;

    public ColoredPoint(int x, String color) {
        super(x);
        this.color = color;
    }

    public ColoredPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public ColoredPoint(int x, int y, int z, String color) {
        super(x, y, z);
        this.color = color;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", цвет: " + color;
    }
}
