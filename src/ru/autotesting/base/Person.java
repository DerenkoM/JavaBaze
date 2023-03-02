package ru.autotesting.base;

public class Person {
    private String familyName;
    private String name;
    private String middleName;
    private int age;
    public static final int minAge = 18;
    public static final int maxAge = 60;

    //конструктор
    public Person(String familyName, String name, String middleName, int age) {
        this.familyName = familyName;
        this.name = name;
        this.middleName = middleName;
        this.age = age;
    }

    //геттеры и сеттеры
    public String getFamilyName(){
        return familyName;
    }
    public String getName(){
        return name;
    }
    public String getMiddleName(){
        return middleName;
    }
    public static int getMinAge(){
        return minAge;
    }
    public static int getMaxAge(){
        return maxAge;
    }
    public int getAge(){
        return age;
    }
    public void setFamilyName(String familyName){
        this.familyName = familyName;
    }
    public void setName(String name){
        if(!(name.length()==0)){
            this.name = name;
        }
    }
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }
    public void setAge (int age){
        this.age = age;
    }

    //методы
    public String toString(){
        return "*** " + familyName + " * " + name + " * " + middleName + " * ему " + age + " лет/год  ***";
    }

    public String toStringShort(){
        return " " + name + " " + familyName + " ";
    }

    public int yearOfBirth (int age){
        return 2022-age;
    }

    public String statusPerson (int age){
        if(age<minAge ){
            return "Не имеет права на трудоустройство";
        } else if (age>=minAge && age<maxAge) {
            return "Имеет право работать";
        }
        else return "Пенсионер";
    }
}