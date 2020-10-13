package ru.ssau.tk.Gumirishche.Practic;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2Test {
    Massif2 massif2 = new Massif2();
    int[] massifTest1 = new int[]{1, 3, 5, 7, 9, 11, 13, 15};

    @Test
    public void testGeneratorMassif() {
        assertEquals(massif2.generatorMassif(8), massifTest1);
        assertEquals(massif2.generatorMassif(2), new int[]{1, 3});
        assertEquals(massif2.generatorMassif(4), new int[]{1, 3, 5, 7});
    }
}