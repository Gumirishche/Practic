package ru.ssau.tk.Gumirishche.Practic;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    Person person1 = new Person();

    @Test
    public void testGetAndSet() {
        person1.setFirstName("John");
        person1.setLastName("Black");
        person1.setPassportId(15163);
        assertEquals(person1.getFirstName(), "John");
        assertEquals(person1.getLastName(), "Black");
        assertEquals(person1.getPassportId(), 15163, 0.000000001);
    }
    @Test
    public void testFirstName(){
        person1.setFirstName("John");
        assertEquals(person1.getFirstName(),"John");
    }
    @Test
    public void testLastName(){
        person1.setLastName("White");
        assertEquals(person1.getLastName(),"White");
    }
    @Test
    public void testPassportId(){
        person1.setPassportId(12345);
        assertEquals(person1.getPassportId(),12345,0.000001);
    }
    @Test
    public void testErrorNull(){
        person1.setLastName(Null);
        assertEquals(person1.getLastName(),"White");
    }
    @Test
    public void testErrorGet(){
        assertEquals(person1.getFirstName(),"John");
    }
}