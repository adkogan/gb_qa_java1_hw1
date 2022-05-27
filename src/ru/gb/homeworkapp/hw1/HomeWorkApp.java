package ru.gb.homeworkapp.hw1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 10;
        if ((a + b) >= 0) {
            System.out.println("the sum is positive");
        } else {
            System.out.println("The sun is negative");
        }
        {
        }

    }

    public static void printColor() {
        int value = 40;
        if (value <= 0) {
            System.out.println("RED");
        }
        if (value > 0 && value <= 100) {
            System.out.println("YELOW");
            {
                if (value > 100) {
                    System.out.println("GREEN");
                }
            }

        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 12;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("“a < b”");
        }
    }


}

