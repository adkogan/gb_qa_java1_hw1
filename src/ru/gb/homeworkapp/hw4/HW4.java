package ru.gb.homeworkapp.hw4;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class HW4 {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static char[][] table;
    static int size = 3;
    static final char xMark = 'X';
    static final char oMark = 'O';
    static final char empty = '.';

    public static void main(String[] args) {

        initTable();
        printTable();

        while (true) {
            turnHuman();
            printTable();
            if (checkWin(xMark)) {
                System.out.println("Human won");
                break;
            }

            if (tableIsFull()) {
                System.out.println("Draw");
                break;
            }

            turnAI();
            printTable();
            if (checkWin(oMark)) {
                System.out.println("Computer won");
                break;
            }
        }
    }

    private static boolean tableIsFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (table[i][j] == empty)
                    return false;
            }
        }
        return true;

    }

    private static boolean checkWin(char symbol) {
//        if (table[0][0] == symbol && table[0][1] == symbol && table[0][2] == symbol) return true;
//        if (table[1][0] == symbol && table[1][1] == symbol && table[1][2] == symbol) return true;
//        if (table[2][0] == symbol && table[2][1] == symbol && table[2][2] == symbol) return true;
//        if (table[0][0] == symbol && table[1][0] == symbol && table[2][0] == symbol) return true;
//        if (table[0][1] == symbol && table[1][1] == symbol && table[2][1] == symbol) return true;
//        if (table[0][2] == symbol && table[1][2] == symbol && table[2][2] == symbol) return true;
//        if (table[0][0] == symbol && table[1][1] == symbol && table[2][2] == symbol) return true;
//        if (table[0][2] == symbol && table[1][1] == symbol && table[2][0] == symbol) return true;

        int hor = 0, vert = 0, diag1 = 0, diag2 = 0;
        for (int i = 0; i <= size - 1; i++) {
            for (int j = 0; j <= size - 1; j++) {

                if (table[i][j] == symbol) {
                    hor++;
                    if (hor == size) return true;
                }

                if (table[j][i] == symbol) {
                    vert++;
                    if (vert == size) return true;
                }
            }

            if (table[i][i] == symbol) {
                diag1++;
                if (diag1 == size) return true;
            } else diag1 = 0;

            if (table[i][size - 1 - i] == symbol) {
                diag2++;
                if (diag2 == size) return true;
            } else diag2 = 0;
        }
        return false;
    }


    private static void printTable() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void initTable() {
        table = new char[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = empty;
            }
        }

    }

    private static void turnHuman() {
        int x, y;

        do {
            System.out.println("Enter x y from 1 to 3");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

        } while (!isValidCell(x, y));

        table[x][y] = xMark;
    }

    private static boolean isValidCell(int x, int y) {
        if (x >= size || y >= size || x < 0 || y < 0)
            return false;
        if (table[x][y] == empty)
            return true;
        return false;
    }


    private static void turnAI() {
        int x, y;

        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        }
        while (!isValidCell(x, y));

        System.out.println("Computer filled[" + (x + 1) + "," + (y + 1) + "]");
        table[x][y] = oMark;

    }


}
