package ru.autotesting.base;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int rangeBegin, rangeEnd, sumNumbers = 0, sumEvenNumbers = 0, quantityNumbers = 0, quantityEvenNumbers = 0;

        System.out.print("Введите начало диапазона:  ");
        Scanner scanner = new Scanner(System.in);
        rangeBegin = scanner.nextInt();
        System.out.print("Введите конец диапазона:  ");
        rangeEnd = scanner.nextInt();

        if (rangeBegin > rangeEnd) {
            System.out.println("Неверно заданы границы диапазона!");
            System.exit(0);
        }

        for (int i = rangeBegin; i <= rangeEnd; i++) {
            sumNumbers += i;
            quantityNumbers += 1;
            if ((i % 2) == 0) {
                quantityEvenNumbers += 1;
                sumEvenNumbers += i;
            }
        }
        double average = (double) sumNumbers / quantityNumbers;
        double averageEven = (double) sumEvenNumbers / quantityEvenNumbers;
        System.out.println("Сумма всех чисел в заданном диапазоне (от " + rangeBegin + " до " + rangeEnd + "): " + sumNumbers);
        System.out.println("Количество чисел в заданном диапазоне: " + (quantityNumbers));
        System.out.println("Среднее арифметическое: (" + sumNumbers + " / " + quantityNumbers + ") = " + average);
        System.out.println();
        System.out.println("Сумма всех четных чисел в заданном диапазоне (от " + rangeBegin + " до " + rangeEnd + "): " + sumEvenNumbers);
        System.out.println("Количество четных чисел в заданном диапазоне: " + quantityEvenNumbers);
        System.out.println("Среднее арифметическое четных чисел: (" + sumEvenNumbers + " / " + quantityEvenNumbers + ") = " + averageEven);
    }
}
