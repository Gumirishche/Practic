package ru.ssau.tk.Gumirishche.Practic;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GeneratorMassifTest {
    GeneratorMassif generatorMassif = new GeneratorMassif();
    int[] massifTest1 = new int[]{2, 1, 1, 1, 1, 2};

    @Test
    public void testGeneratorMassif() {
        assertEquals(generatorMassif.generatorMassif(6), massifTest1);
        assertEquals(generatorMassif.generatorMassif(2), new int[]{2, 2});
        assertEquals(generatorMassif.generatorMassif(4), new int[]{2, 1, 1, 2});
    }
}