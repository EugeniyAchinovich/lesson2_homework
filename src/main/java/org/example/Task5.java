package org.example;

import java.util.Scanner;


// ЗАДАНИЕ 5
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q, w;

        System.out.print("q = ");
        q = scanner.nextInt();
        System.out.print("w = ");
        w = scanner.nextInt();

        System.out.println(q + " / " + w + " = " + q / w + ", остаток = "+ q % w);
    }
}
