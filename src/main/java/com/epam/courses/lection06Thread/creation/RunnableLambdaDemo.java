package com.epam.courses.lection06Thread.creation;

public class RunnableLambdaDemo {
    public static void main(String[] args) {
        Runnable lecture = 
                () -> System.out.println("Now, i am the coolest lecture!");
        new Thread(lecture).start();
    }
}
