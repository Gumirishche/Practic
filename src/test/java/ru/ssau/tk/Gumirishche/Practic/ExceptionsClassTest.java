package ru.ssau.tk.Gumirishche.Practic;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ExceptionsClassTest {
    ExceptionsClass exceptionsClass = new ExceptionsClass();

    @Test
    public void testStringMassif() {
        assertEquals(exceptionsClass.StringMassif(new String[]{"Hello", "World"}, 2), new char[]{'l', 'r'});
        assertEquals(exceptionsClass.StringMassif(new String[]{"яблоко", "лёд", "груша"}, 2), new char[]{'л', 'д', 'у'});

        assertThrows(NullPointerException.class, () -> {
            exceptionsClass.StringMassif(new String[3], 1);
        });
    }

    @Test
    public void testStringsParts() {
        assertEquals(exceptionsClass.StringsParts(new String[]{"Привет", "яблоко"}, 1, 2), 'л');

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            exceptionsClass.StringsParts(new String[]{"hey", "hay"}, 2, 1);
        });
        assertThrows(StringIndexOutOfBoundsException.class, () -> {
            exceptionsClass.StringsParts(new String[]{"hey", "hay"}, 1, 3);
        });
    }

    @Test
    public void testDivisionString() {
        assertEquals(exceptionsClass.divisionString("25", "5"), 5);

        assertThrows(NumberFormatException.class, () -> {
            exceptionsClass.divisionString("53", "");
        });
        assertThrows(NumberFormatException.class, () -> {
            exceptionsClass.divisionString("ghkg", "5");
        });
    }
}