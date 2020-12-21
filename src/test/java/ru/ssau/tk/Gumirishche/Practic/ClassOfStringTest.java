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
    public void testPreAndPost() {
        assertEquals(str.prefixAndPostfix(new String[]{"hello world", "hello", "world"}, "hello", "world"), 1);
        assertEquals(str.prefixAndPostfix(new String[]{"asfs asga asfas", "asff fdhd asfas", "asfs gfnasfas"}, "asfs", "asfas"), 2);
    }

    @Test
    public void testPreAndPostWithTrim() {
        assertEquals(str.prefixAndPostfixWithTrim(new String[]{"   hello world    ", "hello", "world"}, "hello", "world"), 1);
        assertEquals(str.prefixAndPostfixWithTrim(new String[]{"    asfs asga asfas   ", "asff fdhd asfas", "asfs gfnasfas"}, "asfs", "asfas"), 2);
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

    @Test
    public void testCompositeString() {
        assertEquals(str.compositeString("opopopopo", "opo", "po"), "popppo");
        assertEquals(str.compositeString("hehehihehi", "hi", "he"), "hehehehehe");
    }

    @Test
    public void testSubstring() {
        assertEquals(str.substringOfOrigString("hello world", -1, 5), "hello");
        assertEquals(str.substringOfOrigString("hello world", 3, 100), "lo world");
        assertEquals(str.substringOfOrigString("fgjfgjfgjdfgjdjgdhgf", 1, 1), "");
    }

    @Test
    public void testSplitString() {
        assertEquals(str.splitString("hello world"), new String[]{"Hello", "world"});
        assertEquals(str.splitString("my name  is Gumir"), new String[]{"My", "name", "", "is", "Gumir"});
    }

    @Test
    public void testJoinString() {
        assertEquals(str.joinString(new String[]{"Hello", "World"}), "Hello, World");
        assertEquals(str.joinString(new String[]{"one", "two", "three"}), "one, two, three");
    }
}