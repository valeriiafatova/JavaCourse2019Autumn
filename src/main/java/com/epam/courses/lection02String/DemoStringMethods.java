package com.epam.courses.lection02String;

import java.util.Arrays;

public class DemoStringMethods {

    public static void main(String[] args) {
        isEmptyDemo();

    }

    private static void isEmptyDemo() {
        String str1 = "";
        String str2 = null;
        str1.isEmpty();
        boolean b = str2 != null && str2.isEmpty();
    }

//    private static void splitDemo(){
//        String str1 = "Some coll string";
//        str1.split()
//    }

    private static void trimDemo() {
        String str1 = "     \t5555             5\n ";
        String str2 = "     5555             5\n ";
        System.out.println(str2);
        System.out.println(str1);
        System.out.print(str1.trim());
        System.out.print("ha");
    }

    private static void replaceDemo() {
        String str1 = "We are learning C++";
        String str2 = str1.replace('+', '#');
        System.out.println(str2);
        System.out.println(str2.replace("C##", "Java"));
    }

    private static void endsWithDemo() {
        String str1 = "/some/style/style.css";
        boolean b = str1.endsWith(".css");

        System.out.println(b);
    }

    private static void startsWithDemo() {
        String str1 = "/admin/style/style.css";
        boolean b = str1.startsWith("/admin");

        System.out.println(b);
    }

    private static void indexOfDemo() {
        String str1 = "localhost:9002/url/some/thing/cool";
        int indexOf = str1.indexOf("/");
        int lastIndexOf = str1.lastIndexOf("/");
        String url = str1.substring(lastIndexOf);
        String path = str1.substring(indexOf, lastIndexOf);
        System.out.println(lastIndexOf);
        System.out.println(url);
        System.out.println(path);
    }


    private static void compareDemo() {
        String s1 = "1abc";
        String s2 = "1abb";
        String s3 = "1abc";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s2.compareTo(s3));
    }

    private static void charDemo() {
        String s1 = "Hello Epam";
        System.out.println(Arrays.toString(s1.toCharArray()));

        System.out.println(s1.charAt(2));
    }

    private static void regionMatchesDemo() {
        String s1 = new String("Welcome to Epam");
        String s2 = new String("Epam");
        String s3 = new String("EPAM");

        System.out.println(s1.regionMatches(11, s2, 0, 4));

        System.out.println(s1.regionMatches(11, s3, 0, 4));

        System.out.println(s1.regionMatches(true, 11, s3, 0, 4));
    }

    private static void joinDemo() {
        String s1 = "First";
        String s2 = "Second";
        String del = " : ";
        String join = String.join(del, s1, s2);
        System.out.println(join);
    }

    private static void valueOfDemo() {
        String s2 = "7.0";
        String s1 = String.valueOf(7.0D).intern();
        System.out.println(s1);
        System.out.println(s1 == s2);
    }

    private static void concatDemo() {
        String s1 = "I am First String";
        String s2 = s1.concat("I am second String");
        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
    }

}
