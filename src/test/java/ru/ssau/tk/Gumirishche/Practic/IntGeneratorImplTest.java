package ru.ssau.tk.Gumirishche.Practic;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntGeneratorImplTest {
    IntGeneratorImpl intGenerator = new IntGeneratorImpl();

    @Test
    public void testIntGeneratorImpl() {
        assertEquals(intGenerator.nextInt(), 0, 0.00001);
        assertEquals(intGenerator.nextInt(), 1, 0.000001);
        assertEquals(intGenerator.nextInt(), 2, 0.00001);
    }

}