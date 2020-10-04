package ru.ssau.tk.Gumirishche.Practic;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdenticalOperationTest {
    IdenticalOperation identical = new IdenticalOperation();

    @Test
    public void applyTestIdentical() {
        assertEquals(identical.apply(16), 16, 0.00000001);
        assertEquals(identical.apply(-16), -16, 0.000001);
        assertEquals(identical.apply(1.0 / 0.0), 1.0 / 0.0, 0.000001);
        assertEquals(identical.apply(-1.0 / 0.0), -1.0 / 0.0, 0.000001);
        assertEquals(identical.apply(0.0 / 0.0), 0.0 / 0.0, 0.00001);
    }

}