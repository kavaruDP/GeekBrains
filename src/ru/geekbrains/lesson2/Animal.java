package ru.geekbrains.lesson2;

public abstract class  Animal {
    //protected  int age;
    public float currentVal;
    public int age;

    public  Animal(int age) {
        this.age = age;
    }
    public  void sweem(float currentVal) {
        System.out.println("result sweem: " + currentVal );
    }
    public void run(float currentVal) {
        System.out.println("result run: " + currentVal );
    }
    public void jump(float currentVal) {
        System.out.println("result jump: " + currentVal );
    }


}
