package ru.ssau.tk.Gumirishche.Practic;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MassifTest {
    Massif massif01 = new Massif();
    int[] massif02 = new int[5];
    int[] massif03 = new int[15];
    int[] massif04 = new int[30];

    @Test
    public void testMassif() {
        assertEquals(massif01.massifSize(5), massif02);
        assertEquals(massif01.massifSize(15), massif03);
        assertEquals(massif01.massifSize(30), massif04);
    }

    @Test
    public void testArithmeticMassif() {
        assertEquals(massif01.arithmeticMassif(5, 1, 6), new int[]{1, 7, 13, 19, 25});
        assertEquals(massif01.arithmeticMassif(1, 6, 13515), new int[]{6});
        assertEquals(massif01.arithmeticMassif(3, 20, -20), new int[]{20, 0, -20});
    }

}