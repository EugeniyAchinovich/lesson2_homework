package org.example;

import java.util.Scanner;


// ЗАДАНИЕ 3
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, result;

        System.out.print("n = ");
        n = scanner.nextInt();

        result = n / 100 + (n % 100) / 10 + (n % 100) % 10;

        System.out.print("result = ");
        System.out.println(result);
    }
}
