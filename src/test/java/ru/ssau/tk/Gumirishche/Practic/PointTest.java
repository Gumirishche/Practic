package ru.ssau.tk.Gumirishche.Practic;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointTest {

    @Test
    public void testToString() {
        assertEquals(new Point(3, 2, 1).toString(), "[3.0,2.0,1.0]");
        assertEquals(new Point(60, 77.1, 13.23).toString(), "[60.0,77.1,13.23]");
    }

}