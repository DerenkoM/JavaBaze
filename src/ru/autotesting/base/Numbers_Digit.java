package ru.autotesting.base;

import java.util.Scanner;

public class Numbers_Digit {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        //int b = a;
        int summa = 0;
        int summa1 = 0;
        int max = 0;

        while (Math.abs(a) != 0) {
            summa += (Math.abs(a) % 10);

            int max1 = (Math.abs(a) % 10);
            if (max1 > max) {
                max = max1;
            }

            if ((Math.abs(a) % 2) == 1) {
                summa1 += (Math.abs(a) % 10);
            }
            a /= 10;
        }
        System.out.println("Сумма цифр Вашего числа равна " + summa);
        System.out.println("Максимальная цифра в Вашем числе: " + max);
        System.out.println("Сумма нечетных цифр Вашего числа равна " + summa1);//
    }
}
