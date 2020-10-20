package ru.ssau.tk.Gumirishche.Practic;

public class Massif2_6 {
    public int[] sqrMass(int size) {
        int[] fibonacci = new int[size];
        for (int i = 0; i < size; i++) {
            fibonacci[i] = i * i;
        }
        return fibonacci;
    }
}
