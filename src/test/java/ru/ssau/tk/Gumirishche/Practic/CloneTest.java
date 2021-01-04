package ru.ssau.tk.Gumirishche.Practic;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CloneTest {
    @Test
    public void test(){
        Clone1 clone1=new Clone1();
        Clone2 clone2=new Clone2();
        try {
            clone1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        assertThrows(CloneNotSupportedException.class,()->{
            clone2.clone();
        });
    }
}