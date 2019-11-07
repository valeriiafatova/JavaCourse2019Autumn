package com.epam.courses.lection02String;

public class DemoStringFormat {

    public static void main(String... args) {
        //System.out.printf("%6d%n%6d%n%6d%n%-6d%n%d%n%06d",
//                666666, 55555, 4444, 333, 22, 1);

//        System.out.printf("\nTry b: %b\n", new Object());
//        System.out.printf("Try b: %b\n", null);
//        System.out.printf("Try c: %c\n", '\u0304');
//        System.out.printf("Try h: %h\n", "NewString");
//        System.out.println("********");
//        System.out.println("New string".hashCode());
//        System.out.println(new Integer("New string".hashCode()).hashCode());
//        int i = "NewString".hashCode();
//        System.out.printf("Try h: %h\n", i);
//        System.out.println(new Integer(5).hashCode());
//        System.out.printf("Try n: %n%s", "some");

        String str = "Epam";

        //**************

        // Concatenation of two strings
        //System.out.println(String.format("My Company name is %s.", str));

//        // Output is given upto 8 decimal places
        System.out.println(String.format("My answer is %.8f", 47.65734));
//
//        // between "My answer is" and "47.65734000" there are 15 spaces
        System.out.println(String.format("My answer is %15.8f", 47.65734));

        //**************

//
//        String str1 = "EPAM";
//        String str2 = "JAVA ";
//
//        //%1$ represents first argument, %2$ second argument
//        System.out.println(String.format("My company and language" +
//                " is: %1$s, %1$s and %2$s", str1, str2));
//
//        //**************
//        int num = 7044;
//
//        // Output is 3 zero's("000") + "7044",
//        // in total 7 digits
//        System.out.println(String.format("%07d", num));
    }
}
