package com.epam.courses.lection02String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {
    public static void main(String[] args) {
        String input = "world";
        if (input.matches("[A-Za-z]+")) {
            System.out.println("String contains only letters");
        }
        input = "12345";
        if (input.matches("[0-9]+")) {
            System.out.println("String contains only digits");
        }
        input = "12345";
        if (input.matches("[0-9]*")) {
            System.out.println("String contains digits");
        }
        input = "";
        if (input.matches("[0-9]?")) {
            System.out.println("String contains 0 or 1 digit");
        }
        input = "Hello123";

        Pattern lettersPattern = Pattern.compile("[A-Za-z]+");
        Matcher lettersMatcher = lettersPattern.matcher(input);
        if (lettersMatcher.matches()) {
            System.out.println("matches");
        }
    }

}
