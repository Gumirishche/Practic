package ru.ssau.tk.Gumirishche.Practic;

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

    public void paint(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    public static void main(String[] args) {
        Massif x = new Massif();
        x.paint(x.arithmeticMassif(5, 1, 6));
    }
}
