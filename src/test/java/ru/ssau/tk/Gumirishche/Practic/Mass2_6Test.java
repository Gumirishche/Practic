package ru.ssau.tk.Gumirishche.Practic;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Mass2_6Test {
    Mass2_6 mass2_6 = new Mass2_6();

    @Test
    public void testMass2_6() {
        assertEquals(mass2_6.sqrMass(4), new int[]{0, 1, 4, 9});
        assertEquals(mass2_6.sqrMass(5), new int[]{0, 1, 4, 9, 16});
        assertEquals(mass2_6.sqrMass(6), new int[]{0, 1, 4, 9, 16, 25});
    }
}