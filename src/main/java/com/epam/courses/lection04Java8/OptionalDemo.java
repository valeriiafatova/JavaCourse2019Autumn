package com.epam.courses.lection04Java8;

import java.util.Optional;

public class OptionalDemo {
        public static void main(String[] args) {
            Student student = getStudent();
            Optional<Student> optionalStudent = Optional.ofNullable(student);
            Student studentOrElseGet = optionalStudent.orElseGet(() -> new Student());

            optionalStudent
                    .ifPresent(student1 -> System.out.println(student1.getUniversity()));

            Student studentOrElse = optionalStudent.orElse(new Student());

            boolean present = optionalStudent.isPresent();
            if(present){
                Student student1 = optionalStudent.get();
                System.out.println(student.getUniversity());
            }

            if(student != null){
                System.out.println(student.getId());
                System.out.println(student.getUniversity());
            }
        }

        private static Student getStudent(){
            return null;
        }
    }

