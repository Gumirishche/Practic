package ru.ssau.tk.Gumirishche.Practic;

public class ResettableIntGenerator implements Resettable, IntGenerator {
    public int ret = 0;

    @Override
    public int nextInt() {
        ret++;
        return ret - 1;
    }

    @Override
    public void reset() {
        ret = 0;
    }
}
