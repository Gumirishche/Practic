package ru.ssau.tk.Gumirishche.Practic;

public class Person {
    private String firstName;
    private String lastName;
    private int passportId;

    public String getFirstName() {
        return firstName = firstName;
    }

    public String getLastName() {
        return lastName = lastName;
    }

    public int getPassportId() {
        return passportId = passportId;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public static void main(String[] args) {
        Person person1=new Person();
        person1.setFirstName("Gumir");
        person1.setLastName("Ishanov");
        person1.setPassportId(3463473);
        Person person2=new Person();
        person2.setFirstName("Danil");
        person2.setLastName("Diu");
        person2.setPassportId(1254135);
    }
}

