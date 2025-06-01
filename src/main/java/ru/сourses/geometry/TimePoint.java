package ru.сourses.geometry;

public class TimePoint extends CoordinatePoint {
    private final String time;

    public TimePoint(int x, String time) {
        super(x);
        this.time = time;
    }

    public TimePoint(int x, int y, String time) {
        super(x, y);
        this.time = time;
    }

    public TimePoint(int x, int y, int z, String time) {
        super(x, y, z);
        this.time = time;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", время: " + time;
    }
}
