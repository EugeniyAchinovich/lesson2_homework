package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float a, b, result;
        char operator;

        System.out.print("a =                    ");
        a = scanner.nextFloat();
        System.out.print("Операция (+, -, *, /): ");
        operator = scanner.next().charAt(0);
        System.out.print("b =                    ");
        b = scanner.nextFloat();

        result = switch(operator) {
            case '+' -> a + b;
            case '-' ->  a - b;
            case '*' ->  a * b;
            case '/' ->  a / b;
            default -> 0;
        };

        System.out.println(a + " " + operator + " " + b + " = " + result) ;
        System.out.println("Type Q to quit or any key to continue: ");
    }
}