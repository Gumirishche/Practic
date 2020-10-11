package ru.ssau.tk.Gumirishche.Practic;

public class GeneratorMassif {
    public int[] generatorMassif(int size){
        int[] massif=new int[size];
        for(int i =0;i<size;i++){
            if(i==0||i==size-1){
                massif[i]=2;
            }
            else{
                massif[i]=1;
            }
        }
        return massif;
    }
}
