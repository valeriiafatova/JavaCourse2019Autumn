package com.epam.courses.lection03Class;

public class FieldInheritance {
    public static void main(String[] args) {
        InheritanceA a = new InheritanceB();

        a.showSuper();
        a.show();
    }
}

class InheritanceA {
    int i = 10;

    public void showSuper() {
        System.out.println("A print i : " + i);
    }

    public void show() {
        System.out.println("A print this i : " + this.i);
    }
}

class InheritanceB extends InheritanceA {
    int i = 20;

    public void showSuper() {
        System.out.println("B print using super");
        super.showSuper();
    }

    public void show() {
        System.out.println("B print without super");
        System.out.println("B print i : " + i);
    }
}