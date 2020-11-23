package ru.ssau.tk.Gumirishche.Practic;

public class ClassOfString {
    public void StringCharOut(String string){
        for(int i=0;i<string.length();i++){
            System.out.println(string.charAt(i));
        }
    }

    public static void main(String[] args) {
        ClassOfString string=new ClassOfString();
        string.StringCharOut("Hello world");
    }
}
