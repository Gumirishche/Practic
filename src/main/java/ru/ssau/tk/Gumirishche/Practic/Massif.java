package ru.ssau.tk.Gumirishche.Practic;

import java.lang.Math;

public class Massif {
    public int[] massifSize(int size) {
        int[] massif1 = new int[size];
        return massif1;
    }

    public int[] arithmeticMassif(int size, int first, int step) {
        int[] massif = new int[size];
        massif[0] = first;
        for (int i = 1; i < size; i++) {
            massif[i] = massif[i - 1] + step;
        }
        return massif;
    }

    public long[] geometricMassif(int size, int first, double division) {
        long[] massif = new long[size];
        double massifInteger;
        double massifRemains;
        massif[0] = first;
        for (int i = 1; i < size; i++) {
            massifInteger = massif[i - 1] / division;
            massifRemains = massif[i - 1] % division;
            long result = Math.round(massifInteger + massifRemains);
            massif[i] = result;
        }
        return massif;
    }

    public double[] geometricMassif(int size, double first, double division) {
        double[] massif = new double[size];
        double massifInteger;
        double massifRemains;
        massif[0] = first;
        for (int i = 1; i < size; i++) {
            massifInteger = massif[i - 1] / division;
            massifRemains = massif[i - 1] % division;
            double result = massifInteger + massifRemains;
            massif[i] = result;
        }
        return massif;
    }

    public int[] divisionMassif(int number) {
        int size = (int) ((number / (Math.sqrt(number)))-1);
        int[] massif = new int[size];
        int j = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                massif[j] = i;
                j++;
            }
        }
        return massif;
    }

    public void paint(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    public void paint(int size, int first, double division) {
        long[] massif = new long[size];
        double massifInteger;
        double massifRemains;
        massif[0] = first;
        for (int i = 1; i < size; i++) {
            massifInteger = massif[i - 1] / division;
            massifRemains = massif[i - 1] % division;
            long result = Math.round(massifInteger + massifRemains);
            massif[i] = result;
            System.out.println(massif[i]);
        }
    }

    public static void main(String[] args) {
        Massif x = new Massif();
        /*x.paint(x.arithmeticMassif(5, 1, 6));
        x.paint(3,1,0.1);*/
        x.paint(x.divisionMassif(36));
    }
}
