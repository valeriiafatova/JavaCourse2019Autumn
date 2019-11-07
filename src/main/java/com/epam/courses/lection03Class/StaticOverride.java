package com.epam.courses.lection03Class;

public class StaticOverride {
    public static void main(String[] args) {
        StaticOverrideA.show();
        StaticOverrideB.show();
    }
}

class StaticOverrideA {
    static void show() {
        System.out.println("A static show");
    }
}

class StaticOverrideB extends StaticOverrideA {
    //    @Override
    static void show() {
        System.out.println("B static show");
    }
} 
