package ru.ssau.tk.Gumirishche.Practic;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ClassOfStringTest {
    public final ClassOfString str = new ClassOfString();

    @Test
    public void testPalindrome() {
        assertTrue(new ClassOfString().palindrome("supus"));
        assertFalse(new ClassOfString().palindrome("super"));
    }

    @Test
    public void testRegister() {
        assertTrue(new ClassOfString().registerMassif("Test", "test"));
        assertFalse(new ClassOfString().registerMassif("Test", "Test"));
        assertFalse(new ClassOfString().registerMassif("Test", "ErrorTest"));
        assertFalse(new ClassOfString().registerMassif("", ""));
    }

    @Test
    public void testRepetition() {
        assertEquals(str.indexRepetition("Hello world", "el"), 1);
        assertEquals(str.indexRepetition("asgsg4ew asfhg", "as"), 0);
        assertEquals(str.indexRepetition("Hello", "World"), -1);
    }

    @Test
    public void testRepetitionFrom() {
        assertEquals(str.indexRepetitionFrom("Hello world", "or"), 7);
        assertEquals(str.indexRepetitionFrom("asgsg4ew asfhg", "as"), 9);
        assertEquals(str.indexRepetitionFrom("Hello", "World"), -1);
    }

    @Test
    public void testRepetitionLast() {
        assertEquals(str.indexRepetitionLast("Hello world", "el"), 1);
        assertEquals(str.indexRepetitionLast("asgsg4ew asfhg", "as"), 0);
        assertEquals(str.indexRepetitionLast("Hello", "World"), -1);
    }
}