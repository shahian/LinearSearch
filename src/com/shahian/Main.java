package com.shahian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int c, n, search, array[];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Element");
        n = scanner.nextInt();
        array = new int[n];
        System.out.println("Enter " + n + " Integer");
        for (c = 0; c < n; c++)
            array[c] = scanner.nextInt();
        System.out.println("enter value to find");
        search = scanner.nextInt();
        for (c = 0; c < n; c++) {
            if (array[c] == search) {
                System.out.println(search + " is present at location  " + (c + 1) + " .");
                break;
            }
        }
        if (c == n) {
            System.out.println(search + " is not present in array. ");
        }
    }
}
