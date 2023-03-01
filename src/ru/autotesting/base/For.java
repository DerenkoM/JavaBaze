package ru.autotesting.base;

public class For {
    public static void main(String[] args) {

        int x, y, a, count = 0, i;
        x = 1;
        y = 100;
        a = 4;
        System.out.println("Числа кратные " + a + " в диапазоне от " + y + " до " + x + " :");
        for (i = y; i >= x; i--) {
            fun(i, a);
        }
    }

    public static void fun(int i, int a) {

        if ((i % a) == 0) {
            System.out.print(i + " / ");
        }
    }
}
