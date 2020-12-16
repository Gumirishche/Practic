package ru.ssau.tk.Gumirishche.Practic;

public class Matrices {
    static Matrix sum(Matrix x, Matrix y) {
        if (x.width != y.width || x.length != y.length) {
            return null;
        } else {
            Matrix matrix = new Matrix(x.length, x.width);
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < x.width; j++) {
                    matrix.matrix[i][j] = x.matrix[i][j] + y.matrix[i][j];
                }
            }
            return matrix;
        }
    }
}
