package com.epam.courses.lection04Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    private static final String KPI = "KPI";
    private static final String KNEU = "KNEU";
    private static final String KNU = "KNU";
    private static final String NAU = "NAU";

    public static void main(String[] args) {
        long result = getKPIStudentCount();

        System.out.println(result);

        demoFilterCount();

        List<Student> students = setupData();
        List<String> studentsUniversity = students.stream().map(Student::getUniversity).collect(Collectors.toList());

        studentsUniversity.forEach(System.out::println);

        studentMap(students);
    }

    private static Map<Integer, Student> studentMap(List<Student> students) {
        return students.stream().collect(Collectors.toMap(Student::getId, Function.identity()));
    }


    public static long getKPIStudentCount() {
        return setupData().stream().filter(Objects::nonNull).filter(StreamDemo::isKPIStudent).count();
    }

    public static Student getKPIStudent() {
        return setupData().stream().filter(Objects::nonNull).filter(StreamDemo::isKPIStudent).findAny()
                .orElseThrow(IllegalArgumentException::new);
    }

    private static boolean isKPIStudent(Student student) {
        return KPI.equals(student.getUniversity());
    }

    private static void demoFilterCount() {
//        Predicate<Student> studentPredicateWrong = student -> student.getUniversity().equals(KPI);
        List<Student> students = setupData();
        Predicate<Student> studentPredicate = student -> isKPIStudent(student);
        Stream<Student> stream = students.stream();
//        stream.filter(Objects::nonNull)
//                .filter(studentPredicate);

        Stream<Student> studentStream = stream.filter(student -> isKPIStudent(student));
        long count = studentStream.count();
        System.out.println(count);
    }

    private static List<Student> setupData() {
        return Arrays.asList(new Student(1, KPI), new Student(2, KNEU), new Student(3, KPI), new Student(4, KNU),
                new Student(NAU));
    }
}
