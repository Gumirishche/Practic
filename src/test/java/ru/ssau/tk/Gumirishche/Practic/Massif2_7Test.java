package ru.ssau.tk.Gumirishche.Practic;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Massif2_7Test {
    Massif2_7 massif2_7 = new Massif2_7();

    @Test
    public void testResults() {
        assertEquals(massif2_7.results(5, 0, 0), new double[]{0});
        assertEquals(massif2_7.results(2, 0, -18), new double[]{-3, 3});
        assertEquals(massif2_7.results(2, -4, 0), new double[]{0, 2});
    }
}