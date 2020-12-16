package ru.ssau.tk.Gumirishche.Practic;

public class Matrix {
    final int length;
    final int width;
    double[][] matrix;


    public Matrix(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setAt(int n, int m, double value) {
        matrix[n][m] = value;
    }

    public double getAt(int n, int m) {
        return matrix[n][m];
    }
}
