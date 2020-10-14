package ru.geekbrains.lesson2;

public class Cat extends Animal {
    private final int runLimit;
    private final float jumpLimit;

    public Cat(int age) {
        super(age);
        if (age > 1 && age < 4){
            runLimit = 200;
            jumpLimit = 2;
        }
        else {
            runLimit = 100;
            jumpLimit = 1;
        }
    }

    @Override
    public void sweem(int distance) {
        System.out.println("Кошка возраста" + age + " лет не умеет плавать!");

    }

    @Override
    public void run(int distance) {
        if (distance < runLimit) {
            System.out.println("Кошка возраста " + age + " лет пробежала " + distance + " метров");
        } else {
            System.out.println("Кошка возраста " + age + " лет столько не пробежит!");
        }
    }

    @Override
    public void jump(float height) {
        if (height < jumpLimit) {
            System.out.println("Кошка возраста " + age + " лет подпрыгнула на " + height + " метров");
        }
        else {
            System.out.println("Кошка возраста " + age + " лет на такую высоту не прыгает!");
        }
    }
}
