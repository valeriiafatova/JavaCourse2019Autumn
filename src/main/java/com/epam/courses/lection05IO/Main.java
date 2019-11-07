package com.epam.courses.lection05IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream =
                new FileInputStream("D:\\RD\\FinalPr\\IOTutorial\\src\\main\\resources\\test.txt");

        InputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        fileInputStream.read();
        bufferedInputStream.read();

        FileReader fileReader = new FileReader("D:\\RD\\FinalPr\\IOTutorial\\src\\main\\resources\\test.txt");


        demoInput();
    }

    private static void demoInput() throws IOException {
        InputStream inputStream = Main.class.getResourceAsStream("/test.txt");

        int read = inputStream.read();
        System.out.println((char) read);

        byte[] bytes = new byte[10];
        int readToByteArray = inputStream.read(bytes);
        System.out.println("readToByteArray: " + readToByteArray);

        System.out.println(Arrays.toString(bytes));
        printByteArray(bytes);
    }

    public static void printByteArray(byte[] bytes) {
        for (int i = 0; bytes[i] != 0; i++) {
            System.out.println((char) bytes[i]);
        }
    }
}
