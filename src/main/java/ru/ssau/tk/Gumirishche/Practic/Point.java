package ru.ssau.tk.Gumirishche.Practic;

import java.lang.Math;

public class Point {
    public final double x;
    public final double y;
    public final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = y;
    }

    public double length(Point x) {
        return Math.sqrt(x.x + x.y + x.z);
    }

    public static void main(String[] args) {
        Point point1 = new Point(1, 2, 3);
        Point point2 = new Point(3, 2, 1);
    }
}

