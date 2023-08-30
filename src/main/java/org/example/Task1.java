package org.example;

import java.util.Scanner;


// ЗАДАНИЕ 1
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;

        System.out.print("b = ");
        b = scanner.nextInt();
        System.out.print("c = ");
        c = scanner.nextInt();

        a = 4 * (b + c - 1) / 2;

        System.out.print("a = ");
        System.out.println(a);
    }
}
