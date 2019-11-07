package com.epam.courses.lection04Java8;

public class Student {
    int id;
    String university;

    public Student(String university) {
        this.university = university;
    }

    public Student(int id, String university) {
        this.id = id;
        this.university = university;
    }

    public Student() {
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getId() {
        return id;
    }
}
