package com.packages;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[][] asterisk = new char[100][100];
        int intin, i, j;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of symbol in the last row");
        intin = input.nextInt();
        intin = intin - 1;
        for (i = intin; i >= 0; i--) {
            for (j = i; j >= 0; j--) {
                asterisk[i][j]='*';
            }
        }
        for (i = 0; i <= intin; i++) {
            System.out.println();
            for (j = 0; j <= i; j++) {
                System.out.print(asterisk[i][j]);
            }
        }
        intin = intin - 1;
        for (i = intin; i >= 0; i--) {
            System.out.println();
            for (j = i; j >= 0; j--) {
                System.out.print(asterisk[i][j]);
            }
        }
    }
}