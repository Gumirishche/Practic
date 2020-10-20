package ru.ssau.tk.Gumirishche.Practic;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_6Test {
    Massif2_6 massif2_6 = new Massif2_6();

    @Test
    public void testSqrMass() {
        assertEquals(massif2_6.sqrMass(4), new int[]{0, 1, 4, 9});
        assertEquals(massif2_6.sqrMass(5), new int[]{0, 1, 4, 9, 16});
        assertEquals(massif2_6.sqrMass(6), new int[]{0, 1, 4, 9, 16, 25});
    }

}