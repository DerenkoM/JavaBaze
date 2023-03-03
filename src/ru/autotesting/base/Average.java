package ru.autotesting.base;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int x, y, n = 0, n1 = 0;
        double count = 0, count1 = 0;
        System.out.print("Введите начало диапазона:  ");
        Scanner scannerX = new Scanner(System.in);
        x = scannerX.nextInt();
        System.out.print("Введите конец диапазона:  ");
        Scanner scannerY = new Scanner(System.in);
        y = scannerY.nextInt();

        if (x > y) {
            System.out.println("Неверно заданы границы диапазона!");
            System.exit(0);
        }

        for (int i = x; i <= y; i++) {
            n += i;
            count += 1;
            if ((i % 2) == 0) {
                count1 += 1;
                n1 += i;
            }
        }
        System.out.println("Сумма всех чисел в заданном диапазоне (от " + x + " до " + y + "): " + n);
        System.out.println("Количество чисел в заданном диапазоне: " + (int) count);
        System.out.println("Среднее арифметическое: (" + n + " / " + (int) count + ") = " + (n / count));
        System.out.println();
        System.out.println("Сумма всех четных чисел в заданном диапазоне (от " + x + " до " + y + "): " + n1);
        System.out.println("Количество четных чисел в заданном диапазоне: " + (int) count1);
        System.out.println("Среднее арифметическое четных чисел: (" + n1 + " / " + (int) count1 + ") = " + (n1 / count1));
    }
}
