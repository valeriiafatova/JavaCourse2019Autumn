package com.epam.courses.lection06Thread.state;

public class ThreadStateDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("      Main state: " + Thread.currentThread().getState());
        System.out.println("Lesson started. Valeriia ask Max to answer question.");
        Student max = new Student();
        System.out.println("   Max state: " + max.getState());

        System.out.println("Valeriia asks Max the question.");
        max.start();
        System.out.println("   Max state: " + max.getState());

        System.out.println("Valeriia checks attendance");
        Thread.sleep(500);
        System.out.println("   Max state: " + max.getState());

        System.out.println("Valeriia patiently waits for Max to start thinking");
        max.join();
        System.out.println("   Max state: " + max.getState());

        System.out.println("Valeriia is satisfied with answer. Good job!");

        System.out.println("      Main state: " + Thread.currentThread().getState());
    }
}

class Student extends Thread {
    @Override
    public void run() {
        System.out.println("Student is trying to answer to question");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Student answers correct!");
    }
}