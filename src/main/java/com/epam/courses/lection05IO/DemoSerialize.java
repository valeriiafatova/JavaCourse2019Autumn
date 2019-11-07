package com.epam.courses.lection05IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class DemoSerialize {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream outputStream = 
                new ObjectOutputStream(new FileOutputStream("serializableDemo.dat"));
        outputStream.writeObject("Write some string");
        outputStream.writeObject(new Date());
        outputStream.writeObject(new Student("Valeriia"));
        
        outputStream.flush();
        outputStream.close();
    }
}

class Student implements Serializable {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + '}';
    }
}
