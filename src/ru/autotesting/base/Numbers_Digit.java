package ru.autotesting.base;

import java.util.Scanner;

public class Numbers_Digit {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a;
        int summa = 0;

        while (b != 0) {
            summa += (b % 10);
            b /= 10;
        }
        System.out.println("Сумма цифр Вашего числа равна " + summa);

        int max = 0;
        b = a;
        while (b != 0) {
            int max1 = (b % 10);
            if (max1 > max) {
                max = max1;
            }
            b /= 10;
        }
        System.out.println("Максимальная цифра в Вашем числе: " + max);

        b = a;
        summa = 0;
        while (b != 0) {
            if ((b % 2) == 1) {
                summa += (b % 10);
            }
            b /= 10;
        }
        System.out.println("Сумма нечетных цифр Вашего числа равна " + summa);
    }
}
