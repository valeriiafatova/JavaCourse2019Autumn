package com.epam.courses.lection06Thread.creation;

public class ThreadDemo {

    public static void main(String[] args) {
        new LectureThread().start();
    }
}

class LectureThread extends Thread{
    @Override
    public void run() {
        System.out.println("Explain Lecture in Thread!");
    }
}
