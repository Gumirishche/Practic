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

    @Test
    public void testGeometricMassifRound() {
        assertEquals(massif01.geometricMassif(3, 1, 0.1), new long[]{1, 10, 100});
        assertEquals(massif01.geometricMassif(1, 100, 462772), new long[]{100});
        assertEquals(massif01.geometricMassif(3, 100, 5), new long[]{100, 20, 4});
    }

    @Test
    public void testGeometricMassif() {
        double[] x1 = massif01.geometricMassif(3, 1d, 0.1);
        assertEquals(x1[0], 1, 0.001);
        assertEquals(x1[1], 10, 0.1);
        assertEquals(x1[2], 100, 2);
        double[] x2 = massif01.geometricMassif(3, 100d, 5);
        assertEquals(x2[0], 100, 0.001);
        assertEquals(x2[1], 20, 0.00001);
        assertEquals(x2[2], 4, 0.0001);
    }

    @Test
    public void testDivisionMassif() {
        assertEquals(massif01.divisionMassif(9), new int[]{1, 3});
        assertEquals(massif01.divisionMassif(16), new int[]{1, 2, 4});
        assertEquals(massif01.divisionMassif(36), new int[]{1, 2, 3, 4, 6});
    }

    @Test
    public void testSimpleMassif() {
        assertEquals(massif01.simpleMassif(13), new int[]{2, 3, 5, 7, 11, 13});
        assertEquals(massif01.simpleMassif(22), new int[]{2, 3, 5, 7, 11, 13, 17, 19});
        assertEquals(massif01.simpleMassif(7), new int[]{2, 3, 5, 7});
        assertEquals(massif01.simpleMassif(35), new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31});
        assertEquals(massif01.simpleMassif(-10), new int[]{});
    }

    @Test
    public void testSymmetricMassif() {
        assertEquals(massif01.symmetricMassif(5), new int[]{1, 2, 3, 2, 1});
        assertEquals(massif01.symmetricMassif(6), new int[]{1, 2, 3, 3, 2, 1});
    }

    @Test
    public void testOppositeMassif() {
        int[] a = new int[]{1, 2, 3, 4, 5};
        massif01.oppositeMassif(a);
        assertEquals(massif01.getMassif(a), new int[]{-1, -2, -3, -4, -5});
        massif01.oppositeMassif(a);
        assertEquals(massif01.getMassif(a), new int[]{1, 2, 3, 4, 5});
    }

    @Test
    public void testInTheMassif() {
        int[] mass = new int[]{1, 2, 3, 4, 5, 6};
        assertTrue(massif01.inTheMassif(mass, 3));
        assertFalse(massif01.inTheMassif(mass, 0));
        assertFalse(massif01.inTheMassif(mass, -3));
    }

    @Test
    public void testNullMassif() {
        Integer[] mass1 = new Integer[]{1, 2, 3, null};
        Integer[] mass2 = new Integer[]{1, 2, 3};
        assertTrue(massif01.nullMassif(mass1));
        assertFalse(massif01.nullMassif(mass2));
    }

    @Test
    public void testMaxNumberMassif() {
        assertEquals(massif01.maxNumberMassif(new int[]{1, 2, 3, 4, 5, 6, 7}), 7);
        assertNull(massif01.maxNumberMassif(new int[]{}));
        assertEquals(massif01.maxNumberMassif(new int[]{9, 5, 3, 7, 6, 2, 65, 4, 3, 3, 5, 6, 4, 5, 78, 6, 6, 6, 3, 6, 74, 45, 7}), 78);
    }

    @Test
    public void testEvenIndexSum() {
        assertEquals(massif01.evenIndexSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}), 25);
        assertEquals(massif01.evenIndexSum(new int[]{1, 2, 3, 4, 6, 9}), 10);
        assertEquals(massif01.evenIndexSum(new int[]{-1, 2, -3, 4, -5, 6, -7, 8, -9}), -25);
    }

    @Test
    public void testQuantityEvenNumbersMassif() {
        assertEquals(massif01.quantityEvenNumbersMassif(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), 5, 0.0001);
        assertEquals(massif01.quantityEvenNumbersMassif(new int[]{1, 2, 4, 6, 8}), 4, 0.0001);
    }

    @Test
    public void testMassifFirstOrLast() {
        assertTrue(massif01.massifFirstOrLast(new int[]{1, 2, 4, 3, 6, 7, 8, 9}));
        assertFalse(massif01.massifFirstOrLast(new int[]{8, 6, 3, 8, 5, 43, 7, 5, 3, 1}));
    }

    @Test
    public void testMassif21() {
        assertEquals(massif01.massif21(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1}), 1);
        assertEquals(massif01.massif21(new int[]{1, 1, 1, 2, 2, 2, 2, -3, -3, -3, -3, -3}), -3);
    }

    @Test
    public void testIndexOfAnEqualArrayElement() {
        assertEquals(massif01.indexOfAnEqualArrayElement(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 9), 8);
        assertEquals(massif01.indexOfAnEqualArrayElement(new int[]{1, 6, 3, 5, 9, 5, 6, 4, -5, 2, 5}, -5), 8);
    }

    @Test
    public void testChangeMaxAndMin() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        massif01.changeMaxAndMin(a);
        assertEquals(massif01.getMassif(a), new int[]{6, 2, 3, 4, 5, 1});
        int[] b = new int[]{1, 2, -4, 4, 10, 6};
        massif01.changeMaxAndMin(b);
        assertEquals(massif01.getMassif(b), new int[]{1, 2, 10, 4, -4, 6});
    }

    @Test
    public void testNegativeMassif() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        massif01.negativeMassif(a);
        assertEquals(massif01.getMassif(a), new int[]{-1, -2, -3, -4, -5, -6, -7, -8});
        massif01.negativeMassif(a);
        assertEquals(massif01.getMassif(a), new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        massif01.negativeMassif(a);
        massif01.negativeMassif(a);
        assertEquals(massif01.getMassif(a), new int[]{1, 2, 3, 4, 5, 6, 7, 8});
    }

    @Test
    public void testNewNegativeMassif() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(massif01.newNegativeMassif(a), new int[]{-1, -2, -3, -4, -5, -6, -7, -8});
        assertEquals(massif01.getMassif(a), new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        assertEquals(massif01.newNegativeMassif(a), new int[]{-1, -2, -3, -4, -5, -6, -7, -8});
        assertEquals(massif01.newNegativeMassif(a), new int[]{-1, -2, -3, -4, -5, -6, -7, -8});
        assertEquals(massif01.getMassif(a), new int[]{1, 2, 3, 4, 5, 6, 7, 8});
    }

    @Test
    public void testDoubleSum() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(massif01.doubleSum(a), new int[]{3, 7, 11, 15});
        assertEquals(massif01.doubleSum(new int[]{1, 2, 3, 4, 5, 6, 7}), new int[]{3, 7, 11, 7});
    }

    @Test
    public void testBooleansEvenElements() {
        assertEquals(massif01.booleansEvenElements(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}), new boolean[]{false, true, false, true, false, true, false, true, false});
        assertEquals(massif01.booleansEvenElements(new int[]{1, 6, 3, 8, 5, 6, 0, 4, 2, 2}), new boolean[]{false, true, false, true, false, true, true, true, true, true});
    }

    @Test
    public void testNaturalMassif() {
        assertEquals(massif01.naturalMassif(5, 3), new int[]{3, 4, 5, 1, 2});
        assertEquals(massif01.naturalMassif(6, 6), new int[]{6, 1, 2, 3, 4, 5});
    }

    @Test
    public void testDoubleMassif(){
        assertEquals(massif01.doubleMassif(3),new int[][]{{1,2,3},{4,5},{6}});
    }
}