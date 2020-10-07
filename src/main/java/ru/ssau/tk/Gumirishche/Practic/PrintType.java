package ru.ssau.tk.Gumirishche.Practic;

public class PrintType {
    public void printType(byte argument) {
        System.out.println("byte");
    }

    public void printType(char argument) {
        System.out.println("char");
    }

    public void printType(short argument) {
        System.out.println("short");
    }

    public void printType(int argument) {
        System.out.println("int");
    }

    public void printType(long argument) {
        System.out.println("long");
    }

    public void printType(float argument) {
        System.out.println("float");
    }

    public void printType(double argument) {
        System.out.println("double");
    }

    public void printType(boolean argument) {
        System.out.println("boolean");
    }

    public void printType(Object argument) {
        if (argument == null) {
            System.out.println("null");
        } else {
            System.out.println(getClass());
        }
    }

    public static void main(String[] args) {
        byte byt = 16;
        PrintType printType = new PrintType();
        printType.printType(byt);
        char cha = (char) byt;
        printType.printType(cha);
        short shor = (short) cha;
        printType.printType(shor);
        int in = shor;
        printType.printType(in);
        long lon = in;
        printType.printType(lon);
        float floa = lon;
        printType.printType(floa);
        double doubl = floa;
        printType.printType(doubl);
        boolean boolea = true;
        printType.printType(boolea);
        Object object1 = new Person();
        Object object2 = new Points(1, 2, 3);
        printType.printType(object1);
        printType.printType(object2);
        printType.printType(null);
    }
}
