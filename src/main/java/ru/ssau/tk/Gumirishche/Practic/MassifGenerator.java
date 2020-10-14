package ru.ssau.tk.Gumirishche.Practic;

public class MassifGenerator {
    public int[] generatorMassif(int size) {
        int[] massif = new int[size];
        massif[size - 1] = 2;
        for (int i = size - 2; i >= 0; i--) {
            massif[i] = massif[i + 1] + 2;
        }
        return massif;
    }
}
