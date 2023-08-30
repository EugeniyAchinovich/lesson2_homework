package org.example;

import java.util.Scanner;


// ЗАДАНИЕ 2
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, result;

        System.out.print("n = ");
        n = scanner.nextInt();

        result = n / 10 + n % 10;

        System.out.print("result = ");
        System.out.println(result);
    }
}
