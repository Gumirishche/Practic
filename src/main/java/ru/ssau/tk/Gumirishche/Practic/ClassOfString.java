package ru.ssau.tk.Gumirishche.Practic;

public class ClassOfString {
    public void StringCharOut(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }

    public void getBytesOfString(String string) {
        byte[] bytes = string.getBytes();
        int i = 0;
        for (byte byt : bytes) {
            System.out.println(bytes[i++]);
        }
    }

    public void equalsString() {
        String string = "Hello";
        String string2 = new String(string);
        System.out.println(string == string2);
        System.out.println(string.equals(string2));
    }

    public boolean palindrome(String string) {
        String reverseString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString += string.charAt(i);
        }
        return string.equals(reverseString);
    }

    public static void main(String[] args) {
        ClassOfString string = new ClassOfString();
        System.out.println(string.palindrome("supus"));
    }
}
