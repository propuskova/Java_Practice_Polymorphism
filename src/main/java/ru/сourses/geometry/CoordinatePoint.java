package ru.сourses.geometry;

public class CoordinatePoint extends AbstractPoint {
    private final int x, y, z;
    private final int dimensions;

    public CoordinatePoint(int x) {
        this.x = x;
        this.y = 0;
        this.z = 0;
        this.dimensions = 1;
    }

    public CoordinatePoint(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 0;
        this.dimensions = 2;
    }

    public CoordinatePoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.dimensions = 3;
    }

    @Override
    public String getDescription() {
        if (dimensions == 1) return "Точка: (" + x + ")";
        else if (dimensions == 2) return "Точка: (" + x + ", " + y + ")";
        else if (dimensions ==3) return "Точка: (" + x + ", " + y + ", " + z + ")";
        else return "Неизвестная точка";

    }
}

