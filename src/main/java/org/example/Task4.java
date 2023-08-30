package org.example;

import java.util.Scanner;


// ЗАДАНИЕ 4
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float x;

        System.out.print("x = ");
        x = scanner.nextFloat();

        if (x - (int)x >= 0.5)
            x++;

        System.out.print("Округлённое число = ");
        System.out.println((int)x);
    }
}
