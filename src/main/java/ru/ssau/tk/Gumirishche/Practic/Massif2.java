package ru.ssau.tk.Gumirishche.Practic;

public class Massif2 {
    public int[] generatorMassif(int size) {
        int[] massif = new int[size];
        massif[0] = 1;
        for (int i = 1; i < size; i++) {
            massif[i] = massif[i - 1] + 2;
        }
        return massif;
    }
}
