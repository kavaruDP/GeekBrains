package ru.geekbrains.lesson2;

public class Dog extends Animal {
    protected float sweemLimit;
    protected  float runLimit;
    protected  float jumpLimit;

    public Dog(int age) {
        super(age);
        initDogLimit(age);
    }
    private void initDogLimit(int age) {
        if (age > 1 && age < 4){
            sweemLimit = 10;
            runLimit = 200;
            jumpLimit = 2;
        }
        else {
            sweemLimit = 5;
            runLimit = 100;
            jumpLimit = 1;
        }
    }
    @Override
    public void sweem(float distance) {
        System.out.println("result sweem: " + (distance < sweemLimit));
    }

    @Override
    public void run(float distance) {
        System.out.println("result run: " + (distance < runLimit));
    }

    @Override
    public void jump(float distance) {
        System.out.println("result jump: " + (distance < jumpLimit));
    }
}
