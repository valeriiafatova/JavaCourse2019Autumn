package com.epam.courses.lection02String;

public class DemoStringCreation {
    public static void main(String[] args) {
        String str = "This " + "is " + "single " + "string.";
        int a = 5;
        String str2 = "This " + "is " + a + ".";
        System.out.println(str.length());

        char[] helloArray = {'H', 'e', 'l', 'l', 'o', '!'};
        String hello1 = new String(helloArray);
        String hello2 = "Hello!";
        String hello3 = new String("Hello!");

        System.out.println(hello1.hashCode());
        System.out.println(hello2.hashCode());
        System.out.println(hello3.hashCode());
        System.out.println(hello1 == hello3);
        System.out.println(hello1 == hello2);
        System.out.println(hello2 == hello3);
    }
}
