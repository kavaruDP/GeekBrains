package ru.geekbrains.lesson2;

public class Animal {
    //protected  int age;
    public int age;

    public Animal(int age) {
        this.age = age;
    }

    public void sweem(int distance) {
        System.out.println("Животное проплыло " + distance + " метров");
    }
    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " метров");
    }
    public void jump(float height) {
        System.out.println("Животное подпрыгнуло на " + height + " метров");
    }
}
