package ru.geekbrains.lesson2;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void increaseFood(int n) {
        food += n;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public int getFood() {
        return this.food;
    }
}
