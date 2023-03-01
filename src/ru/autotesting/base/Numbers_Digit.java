package ru.autotesting.base;

import java.util.Scanner;

public class Numbers_Digit {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int summa = 0;

        while (a != 0) {
            summa += (a % 10);
            a /= 10;
        }
        System.out.println("Сумма цифр Вашего числа равна " + summa);
    }
}
