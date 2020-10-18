package ru.geekbrains.lesson2;

public class Lesson7 {
    public static void main(String[] args) {
        //createCatMono();

        // ДЗ 7 задание 5: Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
        // и потом вывести информацию о сытости котов в консоль
        Plate plate = new Plate(15);
        createCats(plate);
        plate.info();
        // ДЗ 7 задание 6: добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
        plate.increaseFood(20);
        plate.info();
    }

    public static void createCatMono() {
        Cat cat1 = new Cat(3,"Barsik", 101);
        Cat cat2 = new Cat(3,"Murka", 102);
        Plate plate = new Plate(100);
        plate.info();
        cat1.eat(plate);
        cat2.eat(plate);
        plate.info();
        cat1.info();
        cat2.info();
    }

    public static void createCats(Plate plate) {
        String[] names = {"Barsik","Murka","Tigris","Kuzya"};
        int[] appetits = {5,5,7,3};
        int[] ages = {3,3,3,3};
        Cat[] cats = new Cat[4];
        for (int i=0; i<appetits.length; i++) {
            cats[i] = new Cat(ages[i],names[i],appetits[i]);
            cats[i].eat(plate);
            cats[i].info();
        }
    }
}
