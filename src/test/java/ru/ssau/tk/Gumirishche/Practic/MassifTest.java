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

}