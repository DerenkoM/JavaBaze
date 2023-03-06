package ru.autotesting.base;

import java.util.Scanner;

public class Numbers_Digit {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int digit = Math.abs(scanner.nextInt());
        int summaDigits = 0;
        int summaNotEvenDigits = 0;
        int maxDigit = 0;

        while (digit != 0) {
            summaDigits += (digit % 10);

            int maxDigit1 = (digit % 10);
            if (maxDigit1 > maxDigit) {
                maxDigit = maxDigit1;
            }

            if ((digit % 2) == 1) {
                summaNotEvenDigits += (digit % 10);
            }
            digit /= 10;
        }
        System.out.println("Сумма цифр Вашего числа равна " + summaDigits);
        System.out.println("Максимальная цифра в Вашем числе: " + maxDigit);
        System.out.println("Сумма нечетных цифр Вашего числа равна " + summaNotEvenDigits);
    }
}
