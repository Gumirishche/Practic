package ru.ssau.tk.Gumirishche.Practic;

public class Box {
    public Integer boxing(int a){
        Integer aBoxed = Integer.valueOf(a);
        return  aBoxed;
    }
    public Double boxing(double a){
        Double aBoxed = Double.valueOf(a);
        return aBoxed;
    }
    public int unboxing(Integer aBoxed){
        int a=aBoxed.intValue();
        return a;
    }
    public double unboxing(Double aBoxed){
        double a=aBoxed.doubleValue();
        return a;
    }
    public Integer boxingAuto(int a){
        Integer aBoxed=a;
        return aBoxed;
    }
    public Double boxingAuto(double a){
        Double aBoxed=a;
        return aBoxed;
    }
    public int unboxingAuto(Integer aBoxed){
       int a=Integer.valueOf(aBoxed);
       return a;
    }
    public double unboxingAuto(Double aBoxed){
        double a=Double.valueOf(aBoxed);
        return a;
    }

    public static void main(String[] args) {
        Box box1=new Box();
        box1.boxing(15);
        Box box2=new Box();
        box2.boxing(15d);
        Box box3=new Box();
        box3.boxingAuto(15);
        Box box4=new Box();
        box4.boxingAuto(15d);
    }
}
