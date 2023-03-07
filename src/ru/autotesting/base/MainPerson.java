package ru.autotesting.base;

public class MainPerson {
    public static void main(String[] args) {

        Person person1 = new Person("Иванов", "Иван", "Иванович", 35);
        Person person2 = new Person("Петров", "Петр", "Петрович", 15);
        Person person3 = new Person("Сидоров", "Сидор", "Сидорович", 71);

        System.out.println(person1.toString());
        System.out.println("Год рождения " + person1.toStringShort() + " = " + person1.yearOfBirth(person1.getAge()));
        System.out.println(person1.statusPerson(person1.getAge()));
        System.out.println();

        System.out.println(person2.toString());
        System.out.println("Год рождения " + person2.toStringShort() + " = " + person2.yearOfBirth(person2.getAge()));
        System.out.println(person2.statusPerson(person2.getAge()));
        System.out.println();

        System.out.println(person3.toString());
        System.out.println("Год рождения " + person3.toStringShort() + " = " + person3.yearOfBirth(person3.getAge()));
        System.out.println(person3.statusPerson(person3.getAge()));
        System.out.println();
    }
}
