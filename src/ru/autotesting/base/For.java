package ru.autotesting.base;

public class For {
    public static void main(String[] args) {

        int x, y, a, count = 0, i;
        x = 1;
        y = 100;
        System.out.println("Числа кратные 4 в диапазоне от " + y + " до " + x + " :");
        for (i = y; i >= x; i--) {
            fun(i);
        }
    }

    public static void fun(int a) {
        if ((a % 4) == 0) {
            System.out.print(a + " / ");
        }
    }
}
