package ru.ssau.tk.Gumirishche.Practic;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ClassOfStringTest {

    @Test
    public void testPalindrome() {
        assertTrue(new ClassOfString().palindrome("supus"));
        assertFalse(new ClassOfString().palindrome("super"));
    }

}