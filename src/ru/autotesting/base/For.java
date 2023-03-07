package ru.autotesting.base;

public class For {
    public static void main(String[] args) {

        int rangeBegin = 1, rangeEnd = 100;
        System.out.println("Числа кратные 4 в диапазоне от " + rangeEnd + " до " + rangeBegin + " :");
        for (int i = rangeEnd; i >= rangeBegin; i--) {
            if (fun(i)) {
                System.out.print(i + " / ");
            }

        }
    }

    public static boolean fun(int a) {
        return a % 4 == 0;
    }
}
