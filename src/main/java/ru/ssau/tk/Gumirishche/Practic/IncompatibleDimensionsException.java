package ru.ssau.tk.Gumirishche.Practic;

public class IncompatibleDimensionsException extends RuntimeException{

    public IncompatibleDimensionsException(){
    }

    public IncompatibleDimensionsException(String massage){
        super(massage);
    }
}
