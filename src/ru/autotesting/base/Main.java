package ru.autotesting.base;

public class Main {

    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);

        String str1, str2, phrase;
        str1 = "Hello, ";
        str2 = "world!";
        phrase = str1 + str2;
        System.out.println(phrase);
        System.out.println("Длина строки = "+ phrase.length());
    }

}
