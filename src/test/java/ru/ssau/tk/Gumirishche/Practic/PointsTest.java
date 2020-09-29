package ru.ssau.tk.Gumirishche.Practic;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointsTest {
    Points testPoint1 = new Points(7, 6, 5);
    Points testPoint2 = new Points(3, 2, 1);

    @Test
    public void testSum() {
        testPoint1 = Points.sum(testPoint1, testPoint2);
        assertEquals(testPoint1.x, 10.0000, 0.0000001);
        assertEquals(testPoint1.y, 8d, 0.00001);
        assertEquals(testPoint1.z, 6d, 0.00000001);
    }

    @Test
    public void testSubtract() {
        testPoint1 = Points.subtract(testPoint1, testPoint2);
        assertEquals(testPoint1.x, 4d, 0.0000001);
        assertEquals(testPoint1.y, 4d, 0.000001);
        assertEquals(testPoint1.z, 4d, 0.000001);
    }
    @Test
    public void testMultiply(){
        testPoint1=Points.multiply(testPoint1,testPoint2);
        assertEquals(testPoint1.x,21d,0.000001);
        assertEquals(testPoint1.y,12d,0.000001);
        assertEquals(testPoint1.z,5d,0.0000001);
    }
    @Test
    public void testDivide(){
        testPoint1=Points.divide(testPoint1,testPoint2);
        assertEquals(testPoint1.x,2.333333333333,0.0000001);
        assertEquals(testPoint1.y,3d,0.0000001);
        assertEquals(testPoint1.z,5d,0.00001);
    }
}