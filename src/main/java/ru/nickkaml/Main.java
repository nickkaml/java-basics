package ru.nickkaml;

public class Main {
    public static void main(String[] args) {
        byte byteNumber = -128;
        short shortNumber = -32768;
        int intNumber = -2147483648;
        long longNumber = -9223372036854775808L;
        float floatNumber = Float.MAX_VALUE;
        double doubleNumber = 100.005d;

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








    }
}