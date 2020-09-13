package ru.ssau.tk.Gumirishche.Practic;

public class Point {

    public Point(double X, double Y, double Z) {
        final double x = X;
        final double y = Y;
        final double z = Z;
    }

    public static void main(String[] args) {
        Point point1 = new Point(1, 2, 3);
        Point point2 = new Point(3, 2, 1);
    }
}

