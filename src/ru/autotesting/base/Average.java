package ru.autotesting.base;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int RangeBegin, RangeEnd, sumNumbers = 0, sumEvenNumbers = 0, quantityNumbers = 0, quantityEvenNumbers = 0;
        System.out.print("Введите начало диапазона:  ");
        Scanner scanner = new Scanner(System.in);
        RangeBegin = scanner.nextInt();
        System.out.print("Введите конец диапазона:  ");
        RangeEnd = scanner.nextInt();

        if (RangeBegin > RangeEnd) {
            System.out.println("Неверно заданы границы диапазона!");
            System.exit(0);
        }

        for (int i = RangeBegin; i <= RangeEnd; i++) {
            sumNumbers += i;
            quantityNumbers += 1;
            if ((i % 2) == 0) {
                quantityEvenNumbers += 1;
                sumEvenNumbers += i;
            }
        }
        System.out.println("Сумма всех чисел в заданном диапазоне (от " + RangeBegin + " до " + RangeEnd + "): " + sumNumbers);
        System.out.println("Количество чисел в заданном диапазоне: " + (quantityNumbers));
        System.out.println("Среднее арифметическое: (" + sumNumbers + " / " + quantityNumbers + ") = " + (sumNumbers / (double) quantityNumbers));
        System.out.println();
        System.out.println("Сумма всех четных чисел в заданном диапазоне (от " + RangeBegin + " до " + RangeEnd + "): " + sumEvenNumbers);
        System.out.println("Количество четных чисел в заданном диапазоне: " + quantityEvenNumbers);
        System.out.println("Среднее арифметическое четных чисел: (" + sumEvenNumbers + " / " + (int) quantityEvenNumbers + ") = " + (sumEvenNumbers / (double) quantityEvenNumbers));
    }
}
