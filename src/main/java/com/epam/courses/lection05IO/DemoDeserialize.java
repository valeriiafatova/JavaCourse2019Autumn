package com.epam.courses.lection05IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeserialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream 
                = new ObjectInputStream(new FileInputStream("serializableDemo.dat"));
        Object object = objectInputStream.readObject();
        Object object1 = objectInputStream.readObject();
        Object object2 = objectInputStream.readObject();
        System.out.println(object);
        System.out.println(object1);
        System.out.println(object2);
        
    }
}
