package ru.gb.homeworkapp.hw3;

import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {

        int[] array = createArray(10, 3);
        System.out.println(Arrays.toString(array));


//1. Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] arr = new int[11];
        arr[0] = 1;
        arr[1] = 1;
        arr[3] = 0;
        arr[4] = 0;
        arr[5] = 1;
        arr[6] = 0;
        arr[7] = 1;
        arr[8] = 1;
        arr[9] = 0;
        arr[10] = 0;

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
        System.out.println(Arrays.toString(arr));

        //2.Задать пустой целочисленный массив длиной 100.С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;


        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr1));


        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] arr2 = new int[13];
        arr2[0] = 1;
        arr2[1] = 5;
        arr2[3] = 3;
        arr2[4] = 2;
        arr2[5] = 11;
        arr2[6] = 4;
        arr2[7] = 5;
        arr2[8] = 2;
        arr2[9] = 4;
        arr2[10] = 8;
        arr2[11] = 9;
        arr2[12] = 1;

        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr2));

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
        // если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
        // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];


        int[][] sqrArray = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sqrArray[i][j] = (i == j || j == (4 - i - 1)) ? 1 : (int) (Math.random() * 100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }
    }
    //5. Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;

        }
        return array;



    }
}








