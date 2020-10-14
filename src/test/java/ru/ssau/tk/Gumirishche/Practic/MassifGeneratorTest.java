package ru.ssau.tk.Gumirishche.Practic;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MassifGeneratorTest {
    MassifGenerator massif = new MassifGenerator();

    @Test
    public void testGeneratorMassif() {
        assertEquals(massif.generatorMassif(8), new int[]{16, 14, 12, 10, 8, 6, 4, 2});
        assertEquals(massif.generatorMassif(2), new int[]{4, 2});
        assertEquals(massif.generatorMassif(4), new int[]{8, 6, 4, 2});
    }
}