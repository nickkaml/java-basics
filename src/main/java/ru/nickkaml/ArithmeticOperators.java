package ru.nickkaml;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 25;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a     = " + (a)); // a = 10
        System.out.println("a++   = " + (a++));
        System.out.println("a     = " + (a)); // a = 11
        System.out.println("b--   = " + (b--));
        // Проверьте разницу в d++ и ++d
        System.out.println("a     = " + (d)); // d = 25
        System.out.println("d++   = " + (d++));
        System.out.println("a     = " + (d)); // d = 26
        System.out.println("++d   = " + (++d)); // d = 27


    }

}
