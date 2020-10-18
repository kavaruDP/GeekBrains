package ru.geekbrains.lesson2;

public class Cat extends Animal {
    private float runLimit;
    private float jumpLimit;
    private String name;
    private int appetite;
    private boolean fullness;

    //конструктор для прыгающих и бегающих котов
    public Cat(float distance,int age) {
        super(distance);
        initCatLimit(age);
    }

    //конструктор для кормлящихся котов
    public Cat(float distance, String name, int appetite) {
        super(distance);
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    private void initCatLimit(int age) {
        if (age > 1 && age < 4){
            runLimit = 200;
            jumpLimit = 2;
        }
        else {
            runLimit = 100;
            jumpLimit = 1;
        }
    }

    public void eat(Plate p) {
        int plateFoodRest = p.getFood();
        if (plateFoodRest >= appetite) {
            p.decreaseFood(appetite);
            this.fullness = true;
        }
        else {
            this.fullness = false;
            System.out.println("Необходимо уменьшить кол-во еды! Сейчас в тарелке: " + plateFoodRest);
        }
    }

    public void info() {
        System.out.println("cat " + this.name + " has fullness: " + this.fullness);
    }

    @Override
    public void sweem(float distance) {
        System.out.println("Кошка не умеет плавать!");
    }

    @Override
    public void run(float distance) {
        System.out.println("result sweem: " + (distance < runLimit));
    }

    @Override
    public void jump(float distance) {
        System.out.println("result sweem: " + (distance < jumpLimit));
    }
}
