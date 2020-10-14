package ru.geekbrains.lesson2;

public class Person {
    private String fio;
    private String position;
    private String mail;
    private String tel;
    private int pay;
    private int age;

    public void info() {
        System.out.println("ФИО: " + fio + "; Должность: " + position + "; email: "  + mail + "; Телефон: " + tel + "; Зарплата: " + pay + "; Возраст: " + age);
    }

    public Person(String fio, String position, String mail, String tel, int pay, int age) {
        this.fio = fio;
        this.position = position;
        this.mail = mail;
        this.tel = tel;
        this.pay = pay;
        this.age = age;
    }

    public int GetAge() {
        return this.age;
    }

}
