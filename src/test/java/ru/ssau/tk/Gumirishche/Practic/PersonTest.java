package ru.ssau.tk.Gumirishche.Practic;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    Person person1 = new Person();
    Person person2 = new Person("John", "Black", 2222228, Gender.MALE);
    Person person3 = new Person(Gender.FEMALE);

    @Test
    public void testGetAndSet() {
        person1.setFirstName("John");
        person1.setLastName("Black");
        person1.setPassportId(15163);
        person1.setGender(Gender.MALE);
        assertEquals(person1.getFirstName(), "John");
        assertEquals(person1.getLastName(), "Black");
        assertEquals(person1.getPassportId(), 15163, 0.000000001);
        assertEquals(person1.getGender(), Gender.MALE);
    }

    @Test
    public void testFirstName() {
        person1.setFirstName("John");
        assertEquals(person1.getFirstName(), "John");
    }

    @Test
    public void testLastName() {
        person1.setLastName("White");
        assertEquals(person1.getLastName(), "White");
    }

    @Test
    public void testPassportId() {
        person1.setPassportId(12345);
        assertEquals(person1.getPassportId(), 12345, 0.000001);
    }

    @Test
    public void testGender() {
        assertEquals(person3.getGender(), Gender.FEMALE);
    }

    @Test
    public void testToString() {
        Person person = new Person("Uri", "West");
        assertEquals(person2.toString(), "John Black");
        assertEquals(person.toString(), "Uri West");
    }

    @Test
    public void testException() {
        Person person = new Person("Uri", "West");
        assertEquals(person2.exceptionPerson(person2), "John Black");
        assertEquals(person.exceptionPerson(person), "Uri West");

        Assert.assertThrows(NullPointerException.class, () -> {
            person.exceptionPerson(null);
        });
    }

    @Test
    public void testPersonConstr() {
        assertEquals(person2.getFirstName(), "John");
        assertEquals(person2.getLastName(), "Black");
        assertEquals(person2.getPassportId(), 2222228);
        assertEquals(person2.getGender(), Gender.MALE);
    }
    /*@Test
    public void testErrorNull(){
        person1.setLastName(Null);
        assertEquals(person1.getLastName(),"White");
    }*/
   /* @Test
    public void testErrorGet(){
        assertEquals(person1.getFirstName(),"John");
    }*/
}