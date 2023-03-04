package ru.autotesting.base;

public class For {
    public static void main(String[] args) {

        int RangeBegin = 1, RangeEnd = 100;
        System.out.println("Числа кратные 4 в диапазоне от " + RangeEnd + " до " + RangeBegin + " :");
        for (int i = RangeEnd; i >= RangeBegin; i--) {
            fun(i);
        }
    }

    public static void fun(int a) {
        if ((a % 4) == 0) {
            System.out.print(a + " / ");
        }
    }
}
