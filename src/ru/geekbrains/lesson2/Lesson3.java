package ru.geekbrains.lesson2;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class Lesson3 {
    public static Scanner sc = new Scanner(in);
    public static void main(String[] args) {
        //Проверка задания 1
        int numAttempt = 3;
        guessNumber(numAttempt);
        String string = sc.nextLine();  //очистка сканера перед вызовом следующего метода
        //Проверка задания 2
        String[] wordsArr = {
                "apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"
        };
        numAttempt = 10;
        guessWord(wordsArr,numAttempt);
        sc.close();
    }
    // Вспомогательные методы
    public static int getNumberFromScanner(String message, int min, int max) {
        int x =-1;
        String str;
        boolean isNotCorrect = true;
        do {
            if (sc.hasNextInt()) {
                x = sc.nextInt();
                if (x >= min && x <= max) {
                    isNotCorrect = false;
                }
                else {
                    out.println(message);
                }
            }
            else {
                str = sc.next();
                out.println("Ваш ввод не распознан. " + message);
            }

        } while (isNotCorrect);
        return x;
    }

    public static String getWordFromScanner(String message) {
        String str;
        boolean isNotCorrect = true;
        do {
            if (sc.hasNextLine()) {
                str = sc.nextLine();
                isNotCorrect = false;
            }
            else {
                str = sc.next();
                out.println("Ваш ввод не распознан. " + message);
            }

        } while (isNotCorrect);
        return str;
    }

    // Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
    // При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
    // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    static void guessNumber(int numAttempt) {
        Random rand = new Random();
        int x = rand.nextInt(10);
        //System.out.println("В буфере:" + x);
        int z;
        do {
            for (int i=1; i<=numAttempt; i++) {
                out.println("Попытка №" + i + " Введите число от 0 до 9:");
                int y = getNumberFromScanner("Число должно быть в диапазоне от 0 до 9!",0,9);
                if (x==y) {
                    out.println("Вы угадали!");
                    break;
                }
                if (i==numAttempt) {
                    out.println("Вы не угадали...");
                }
            }
            out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            z = sc.nextInt();
        } while (z==1);
        out.println("Игра окончена!");
    }
    // При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    // сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
    // Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
    // apple – загаданное
    // apricot - ответ игрока
    // ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    // Для сравнения двух слов посимвольно можно пользоваться:
    // String str = "apple";
    // char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    // Играем до тех пор, пока игрок не отгадает слово.
    // Используем только маленькие буквы.
    static void guessWord(String[] arr, int numAttempt) {
        Random rand = new Random();
        int x = rand.nextInt(arr.length);
        String secretWord = arr[x];
        out.println("Подсказка: " + secretWord);
        int count = 1;
        do {
            out.println("Попытка №" + count);
            String myWord = getWordFromScanner("Введите слово:");
            if (myWord.equalsIgnoreCase(secretWord)) {
                    out.println("Вы угадали!");
                    break;
            }
            else {
                StringBuilder result = new StringBuilder();
                for (int i=0; i< myWord.length(); i++) {
                    char b = myWord.charAt(i);
                    if (i == secretWord.length()) {
                        break;
                    }
                    char a = secretWord.charAt(i);
                    if (a==b) {
                        result.append(a);
                    }
                    else {
                        result.append("#");
                    }
                }
                int rl = result.length();
                if (rl<15) {
                    for (int i=rl; i< 15; i++) {
                        result.append("#");
                    }
                }
                out.println("Возможно вы угадали некоторые буквы:" + result);
            }
            count++;
        } while (count < numAttempt);
    }
}
