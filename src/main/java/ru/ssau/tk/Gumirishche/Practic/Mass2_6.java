package ru.ssau.tk.Gumirishche.Practic;

public class Mass2_6 {
    public int[] sqrMass(int size) {
        int[] sqr = new int[size];
        for (int i = 0; i < size; i++) {
            sqr[i] = i * i;
        }
        return sqr;
    }
}
