package ru.ssau.tk.Gumirishche.Practic;

public class ClassOfString {
    public void StringCharOut(String string){
        for(int i=0;i<string.length();i++){
            System.out.println(string.charAt(i));
        }
    }

    public void getBytesOfString(String string){
       byte[] bytes= string.getBytes();
       int i=0;
        for (byte byt :bytes) {
            System.out.println(bytes[i++]);
        }
    }

    public void equalsString(){
        String string="Hello";
        String string2=new String(string);
        System.out.println(string==string2);
        System.out.println(string.equals(string2));
    }

    public static void main(String[] args) {
        ClassOfString string=new ClassOfString();
        string.equalsString();
    }
}
