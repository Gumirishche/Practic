package ru.ssau.tk.Gumirishche.Practic;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ResettableIntGeneratorTest {
    ResettableIntGenerator resettableIntGenerator = new ResettableIntGenerator();

    @Test
    public void testResettableIntGenerator() {
        assertEquals(resettableIntGenerator.nextInt(), 0, 0.00001);
        assertEquals(resettableIntGenerator.nextInt(), 1, 0.00001);
        assertEquals(resettableIntGenerator.nextInt(), 2, 0.000001);
        resettableIntGenerator.reset();
        assertEquals(resettableIntGenerator.nextInt(), 0, 0.00001);
    }
}