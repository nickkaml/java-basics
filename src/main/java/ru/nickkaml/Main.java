package ru.nickkaml;

public class Main {
    public static void main(String[] args) {
        byte byteNumber = -128;
        short shortNumber = -32768;
        int intNumber = -2147483648;
        long longNumber = -9223372036854775808L;
        float floatNumber = Float.MAX_VALUE;
        double doubleNumber = Double.MAX_VALUE;


        //переполнение byte
        byteNumber = (byte) (byteNumber - 1);
        System.out.println("Вернулись к верхней границе диапазона для byte = " + byteNumber); // = 127

        //переполнение short
        shortNumber = (short) (shortNumber - 1);
        System.out.println("Вернулись к верхней границе диапазона для short = " + shortNumber); // = 32767

        //переполнение int
        intNumber = intNumber - 1;
        System.out.println("Вернулись к верхней границе диапазона для int = " + intNumber); // = 2147483647

        //переполнение longNumber
        longNumber = longNumber - 1L;
        System.out.println("Вернулись к верхней границе диапазона для long = " + longNumber); // = 9223372036854775807

        //переполнение floatNumber
        floatNumber = floatNumber + floatNumber;
        System.out.println("Переполнение для float = " + floatNumber); // = Infinity

        //переполнение doubleNumber
        doubleNumber = doubleNumber + doubleNumber;
        System.out.println("Переполнение для double = " + doubleNumber); // = Infinity


        // умножение int и double
        int a = 2;
        double b = 400.5;
        System.out.println("2 x 400.5 = " + (a * b)); // = 801.0

        //сравнение int и double
        System.out.println("2 <= 400.5 = " + (a <= b)); // = true


    }
}