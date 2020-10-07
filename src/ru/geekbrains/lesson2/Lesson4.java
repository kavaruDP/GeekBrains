package ru.geekbrains.lesson2;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static int humanX;
    public static int humanY;
    public static final int[] shiftX = {1,-1,0,0,1,-1};
    public static final int[] shiftY = {0,0,-1,1,1,-1};
    public static int maxShift = 5;

        public static void main(String[] args) {
            initMap();
            printMap();

            while (true) {
                humanTurn();
                printMap();
                if (checkWin(DOT_X)) {
                    System.out.println("Победил человек");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
                aiTurnForce();
                printMap();
                if (checkWin(DOT_O)) {
                    System.out.println("Победил Искуственный Интеллект");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("Игра закончена");
        }

        public static boolean checkWin(char symb) {
            int count = 1;
            for (int i=0; i<SIZE; i++) {
                for (int j=0; j<SIZE-1; j++) {
                    if (map[i][j] == symb && map[i][j] == map[i][j+1]) {
                        count ++;
                    } else {
                        count = 1;
                    }
                    if (count == DOTS_TO_WIN) {
                        return true;
                    }
                }
            }
            count = 1;
            for (int j=0; j<SIZE; j++) {
                for (int i=0; i<SIZE-1; i++) {
                    if (map[i][j] == symb && map[i][j] == map[i+1][j]) {
                        count ++;
                    } else {
                        count = 1;
                    }
                    if (count == DOTS_TO_WIN) {
                        return true;
                    }
                }
            }
            count = 1;
            for (int i=0; i<SIZE-1; i++) {
                if (map[i][i] == symb && map[i][i] == map[i+1][i+1]) {
                    count ++;
                } else {
                    count = 1;
                }
                if (count == DOTS_TO_WIN) {
                    return true;
                }
            }
            count = 1;
            for (int i=0; i<SIZE-1; i++) {
                if (map[i][SIZE-i-1] == symb && map[i][SIZE-i-1] == map[i+1][SIZE-i-2]) {
                    count ++;
                } else {
                    count = 1;
                }
                if (count == DOTS_TO_WIN) {
                    return true;
                }
            }
            return false;
        }

        public static boolean isMapFull() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) return false;
                }
            }
            return true;
        }

        public static void aiTurn() {
            int x, y;
            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            } while (!isCellValid(x, y));
            System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
            map[y][x] = DOT_O;
        }
        public static void aiTurnForce() {
            int x, y;
            int i = 0;
            do {
                if (i <=maxShift) {
                    x = humanX + shiftX[i];
                    y = humanY + shiftY[i];
                    i++;
                }
                else {
                    x = rand.nextInt(SIZE);
                    y = rand.nextInt(SIZE);
                }
            } while (!isCellValid(x, y));
            System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
            map[y][x] = DOT_O;
        }

        public static void humanTurn() {
            int x, y;
            do {
                System.out.println("Введите координаты в формате X Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
            map[y][x] = DOT_X;
            humanX = x;
            humanY = y;
        }

        public static boolean isCellValid(int x, int y) {
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
            if (map[y][x] == DOT_EMPTY) return true;
            return false;
        }

        public static void initMap() {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        public static void printMap() {
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
