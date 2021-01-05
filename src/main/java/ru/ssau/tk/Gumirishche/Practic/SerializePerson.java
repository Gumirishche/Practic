package ru.ssau.tk.Gumirishche.Practic;

import java.io.*;

public class SerializePerson implements Serializable {

    public static void serialize(OutputStream outputStream,Object o) throws IOException {
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(o);
            objectOutputStream.flush();
    }

    public static void main(String[] args){
        try {
            serialize(new ByteArrayOutputStream(),new Person("Gumir","hey",312));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
