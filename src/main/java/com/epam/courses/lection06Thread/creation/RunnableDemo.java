package com.epam.courses.lection06Thread.creation;

public class RunnableDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " : I am in classroom");
        Lecture lecture = new Lecture();
        new Thread().run();
    }
}

class Lecture implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : Explaining lovely theme ;P");
    }
}
