package ru.geekbrains.lesson2;

public class Dog extends Animal {
    private final int sweemLimit;
    private final int runLimit;
    private final float jumpLimit;

    public Dog(int age) {
        super(age);
        if (age > 1 && age < 4){
            sweemLimit = 10;
            runLimit = 600;
            jumpLimit = 2;
        }
        else {
            sweemLimit = 5;
            runLimit = 400;
            jumpLimit = 1;
        }
    }
    @Override
    public void sweem(int distance) {
        if (distance < sweemLimit) {
            System.out.println("Собака возраста " + age + " лет проплыла " + distance + " метров");
        }
        else {
            System.out.println("Собака возраста " + age + " лет на такое расстояние не плавает!");
        }
    }

    @Override
    public void run(int distance) {
        if (distance < runLimit) {
            System.out.println("Собака возраста " + age + " лет пробежала " + distance + " метров");
        } else {
            System.out.println("Собака возраста " + age + " лет столько не пробежит!");
        }
    }

    @Override
    public void jump(float height) {
        if (height < jumpLimit) {
            System.out.println("Собака возраста " + age + " лет подпрыгнула на " + height + " метров");
        }
        else {
            System.out.println("Собака возраста " + age + " лет на такую высоту не прыгает!");
        }
    }

}
