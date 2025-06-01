package ru.сourses.geometry;

public class ClosedPolyLine extends PolyLine {
    public ClosedPolyLine(Point... points) {
        super(points);
    }

    @Override
    public double getLength() {
        double length = super.getLength();
        if (points.length > 1) {
            double dx = points[0].x - points[points.length - 1].x;
            double dy = points[0].y - points[points.length - 1].y;
            double closeLine = Math.sqrt(dx*dx + dy*dy);
            return length+closeLine;
        }
        return length;
    }

}
