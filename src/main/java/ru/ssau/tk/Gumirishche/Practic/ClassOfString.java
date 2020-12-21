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

    public boolean registerMassif(String str1, String str2) {
        if (str1.equals(str2) == false && str1.equalsIgnoreCase(str2)) {
            return true;
        } else {
            return false;
        }
    }

    public void test() {
        int i = 0;
        System.out.println("\t№" + ++i);
        System.out.println("\b№" + ++i);
        System.out.println("\n№" + ++i);
        System.out.println("\r№" + ++i);
        System.out.println("\'№" + ++i);
        System.out.println("\"№" + ++i);
        System.out.println("\\№" + ++i);
        System.out.println("/'№" + ++i);
    }

    public int indexRepetition(String str1, String str2) {
        return str1.indexOf(str2);
    }

    public int indexRepetitionFrom(String str1, String str2) {
        return str1.indexOf(str2, (str1.length() - 1) / 2);
    }

    public boolean palindrome(String string) {
        String reverseString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString += string.charAt(i);
        }
        return string.equals(reverseString);
    }

    public int prefixAndPostfix(String[] strings, String prefix, String postfix) {
        int quantity = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].startsWith(prefix) && strings[i].endsWith(postfix)) {
                quantity++;
            }
        }
        return quantity;
    }

    public int prefixAndPostfixWithTrim(String[] strings, String prefix, String postfix) {
        int quantity = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].trim().startsWith(prefix) && strings[i].trim().endsWith(postfix)) {
                quantity++;
            }
        }
        return quantity;
    }

    public int indexRepetitionLast(String str1, String str2) {
        return str1.lastIndexOf(str2, (str1.length() - 1) / 2);
    }

    public String compositeString(String str1, String str2, String str3) {
        int i;
        for (i = 0; i < 100; i++) {
            if (str1.contains(str2)) {
                str1 = str1.replaceAll(str2, str3);
            } else {
                break;
            }
            i++;
        }
        return str1;
    }

    public String substringOfOrigString(String str, int from, int to) {
        if (from < 0) {
            from = 0;
        }
        if (to > str.length()) {
            to = str.length();
        }
        if (from == to) {
            return str = "";
        } else {
            return str.substring(from, to);
        }
    }

    public void implicitToString(Object o) {
        System.out.println("Описание объекта: " + o);
    }

    public String[] splitString(String str) {
        String[] strings = str.split(" ");
        strings[0] = strings[0].substring(0, 1).toUpperCase() + strings[0].substring(1);
        int i = 0;
        for (String s : strings) {
            System.out.println(strings[i++]);
        }
        return strings;
    }

    public String joinString(String[] strings) {
        return String.join(", ", strings);
    }

    public static void main(String[] args) {
        ClassOfString string = new ClassOfString();
        string.splitString("hello world! I am is Gumir");
        /*string.implicitToString(new Point(12, 12, 12));
        string.implicitToString(new Person("Gumir", "Ishanov", 1234, Gender.MALE));
        string.implicitToString(new NamedPoint(12, 12, 12, "Point"));*/
    }
}
