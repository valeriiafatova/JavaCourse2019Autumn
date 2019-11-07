package com.epam.courses.lection03Class;

public class Initialization {
    public static void main(String[] args) {
        new InitializationA();
    }
}

class InitializationA {
    private int i;

    {
        System.out.println("Ex1.A: I before: " + i);
        i = 20;
        System.out.println("Ex1.A: I after: " + i);
    }

    {
        System.out.println("Dynamic block Ex1.A");
    }

    static {
        System.out.println("Static block Ex1.A");
    }

    public InitializationA() {
        System.out.println("Constructor Ex1.A");
    }

    public InitializationA(String name) {
        this();
        System.out.println("Ex1.A - name: " + name);
    }

    {
        System.out.println("Dynamic block 2 Ex1.A");
    }

}

class InitializationB extends InitializationA {
    private int i = 10;

    {
        System.out.println("Ex1.B: I before: " + i);
        i = 20;
        System.out.println("Ex1.B: I after: " + i);
    }

    {
        System.out.println("Dynamic block Ex1.B");
    }

    static {
        System.out.println("Static block Ex1.B");
    }

    public InitializationB() {
        super("b const");
        System.out.println("Constructor Ex1.B");
    }

    {
        System.out.println("Dynamic block 2 Ex1.B");
    }

} 