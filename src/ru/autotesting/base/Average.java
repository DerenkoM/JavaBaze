package ru.autotesting.base;

public class Average {
    public static void main(String[] args) {
        int x,y,n=0,count=0;
        x=3;
        y=17;

        for (int i=x;i<=y;i++){
            n+=i;
            count+=1;
        }
        System.out.println("Сумма всех чисел в заданном диапазоне (от "+ x+ " до " + y +"): " + n);
        System.out.println("Количество чисел в заданном диапазоне: " + count);
        System.out.println("Среднее арифметическое: (" + n + " / " + count + ") = " + (n/count));
        System.out.println();
        n=0;
        count=0;

        for (int i=x;i<=y;i++){
            if((i % 2) == 0){
                count+=1;
                n+=i;
            }
        }
        System.out.println("Сумма всех четных чисел в заданном диапазоне (от "+ x+ " до " + y +"): " + n);
        System.out.println("Количество четных чисел в заданном диапазоне: " + count);
        System.out.println("Среднее арифметическое четных чисел: (" + n + " / " + count + ") = " + (n/count));
    }
}
