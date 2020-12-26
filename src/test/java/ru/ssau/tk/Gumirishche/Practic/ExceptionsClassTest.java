package ru.ssau.tk.Gumirishche.Practic;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ExceptionsClassTest {
    ExceptionsClass exceptionsClass=new ExceptionsClass();

    @Test
    public void testStringMassif(){
        assertEquals(exceptionsClass.StringMassif(new String[]{"Hello","World"},2),new char[]{'l','r'});
        assertEquals(exceptionsClass.StringMassif(new String[]{"яблоко","лёд","груша"},2),new char[]{'л','д','у'});

        assertThrows(NullPointerException.class,()->{
            exceptionsClass.StringMassif(new String[3],1);
        });
    }
}