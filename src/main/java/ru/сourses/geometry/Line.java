package ru.сourses.geometry;

import ru.сourses.geometry.Measurable;

public class Line implements Measurable {
    Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double getLength() {
        double dx = end.x - start.x;
        double dy = end.y - start.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}
