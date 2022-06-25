package ru.gb.homeworkapp.hw2;

public class Hw2 {

    public static void main(String[] args) {
        System.out.println(checkSum(16, 6));
        ifNumberIsNegative(-78);
        System.out.println(IfNumberIsPositive(-78));
        printString(5, "Gimme, gimme, gimme a man after midnight");
        System.out.println(isLeapYear(2000));


    }

    public static boolean checkSum(int a, int b) {
        //int sum = a + b;
        return a + b >= 10 && a + b <= 20;
    }

    public static void ifNumberIsNegative(int a) {
        if (a >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }

    public static boolean IfNumberIsPositive(int a) {
        return a < 0;
    }

    public static void printString(int a, String b) {
        for (int i = 0; i < a; i++)
            System.out.println(b);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }


}





