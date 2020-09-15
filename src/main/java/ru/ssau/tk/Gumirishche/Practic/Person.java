package ru.ssau.tk.Gumirishche.Practic;

public class Person {
    private String firstName;
    private String lastName;
    private int passportId;

    void Konstr1() {
        firstName="Gumir";
        lastName="Ishanov";
        passportId=647457;
    }

    void Konstr2(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
        passportId=647457;
    }

    void Konstr3(int passportId) {
        this.passportId=passportId;
        firstName="Gumir";
        lastName="Ishanov";
    }

    void Konstr4(int passportId, String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.passportId=passportId;
    }

    String getFirstName() {
        return firstName = firstName;
    }

    String getLastName() {
        return lastName = lastName;
    }

    int getPassportId() {
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


}