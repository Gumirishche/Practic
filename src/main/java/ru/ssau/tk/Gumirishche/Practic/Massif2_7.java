package ru.ssau.tk.Gumirishche.Practic;

import java.lang.Math;

public class Massif2_7 {
    double[] results;

    public double[] results(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Error");
        } else if (d == 0) {
            double x = (-b) / (2 * a);
            results = new double[]{x};
        } else {
            double x1 = ((-b + Math.sqrt(d)) / (2 * a))+((-b + Math.sqrt(d)) % (2 * a));
            double x2 = (-b - Math.sqrt(d)) / (2 * a)+((-b - Math.sqrt(d)) % (2 * a));
            if (x1 > x2) {
                results = new double[]{x2, x1};
            } else {
                results = new double[]{x1, x2};
            }
        }
        return results;
    }
}
