package ru.geekbrains.lesson2;

public class Main {

    public static void main(String[] args) {
        //Проверка задания 4
        create2DArray(5,5);
        //Проверка задания 5
        findMinMaxIn1DArray();
        //Проверка задания 6
        int[] myArr1 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(isBalanceTrue(myArr1));
        //Проверка задания 7
        int[] myArr2 = {1, 2, 3, 4, 5};
        int n = -3;
        shiftElements(myArr2,n);
    }
    // Вспомогательный метод для печати 1D массива в одну строку
    static void printArr(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    // Начало ДЗ
    // Задание 1
    // Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    static void create1DArray1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i=0; i< 10; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }
            else {
                arr[i] = 0;
            }
        }
        // проверка
        for (int i=0; i< 10; i++) {
            System.out.print(arr[i]);
        }
    }
    // Задание 2
    // Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    static void create1DArray2() {
        int[] arr = new int[8];
        for (int i=0; i< 8; i++) {
            arr[i] = i*3;
        }
        // проверка
        for (int i=0; i< 8; i++) {
            System.out.print(arr[i]);
        }
    }
    // Задание 3
    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
    static void create1DArray3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i< 12; i++) {
            if (arr[i] < 6) {
             arr[i] *=2;
            }
        }
        // проверка
        for (int i=0; i< 12; i++) {
            System.out.print(arr[i]);
        }
    }
    // Задание 4
    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    static void create2DArray(int a, int b) {
        int[][] arr = new int[a][b];
        for (int i=0; i< a; i++) {
            for (int j = 0; j < b; j++) {
                if (j == i) {
                    arr[i][j] = 1;
                }
            }
        }
        // проверка
        for (int i=0; i< a; i++) {
            System.out.print("строка " + i + ": ");
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }
    }
    // Задание 5
    //Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    static void findMinMaxIn1DArray() {
        int[] arr = {1, 0, 5, 6, 7, 9, 10, 3, 100, -1};
        int max = arr[0];
        int min = arr[0];
        for (int i=1; i< 10; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
    // Задание 6
    // Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой
    // и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    // checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
    static boolean isBalanceTrue(int[] arr) {
        int size = arr.length;
        int sumLeft = 0;
        int sumRight = 0;
        for (int i=1; i< size; i++) {
            for (int j=0; j< i; j++) {
                sumLeft = sumLeft + arr[j];
            }
            for (int k=i; k< size; k++) {
                sumRight = sumRight + arr[k];
            }
            if (sumLeft == sumRight) {
                return true;
            }
            else {
                sumLeft = 0;
                sumRight = 0;
            }
        }
        return false;
    }
    // Задание 7
    // Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементымассива на n позиций.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    static void shiftElements(int[] arr, int n) {
        int lastIndex = arr.length - 1;
        int tmp;
        if (n>0) {
            for (int i=1; i<=n; i++) {
                tmp = arr[lastIndex];
                for (int j=lastIndex; j>0; j-- ) {
                    arr[j] = arr[j-1];
                }
                arr[0] = tmp;
            }
        }
        else if (n<0) {
            int lastIterator = n*(-1);
            for (int i=1; i<=lastIterator; i++) {
                tmp = arr[0];
                for (int j=0; j<lastIndex; j++ ) {
                    arr[j] = arr[j+1];
                }
                arr[lastIndex] = tmp;
            }
        }
        printArr(arr);
    }
}
