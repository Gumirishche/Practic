package ru.ssau.tk.Gumirishche.Practic;

public class IntGeneratorImpl implements IntGenerator {
    public int ret = 0;

    @Override
    public int nextInt() {
        ret++;
        return ret - 1;
    }
}

