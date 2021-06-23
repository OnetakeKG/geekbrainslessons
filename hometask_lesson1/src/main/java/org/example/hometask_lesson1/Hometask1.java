package org.example.hometask_lesson1;

public class Hometask1 {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Task 2:");
        System.out.println("Task 3:");
        task3(0);
        System.out.println("Task 4:");
        System.out.println(task4(10));
        task6 (300);
    }

    static float task1(float a, float b, float c, float d) {
        a = 10; b = 10; c = 10; d = 10;
        float result = a * (b + (c / d));
        return result;
    }

    static boolean task2 (int first, int second) {

        return first + second <= 20 && first + second >= 10;
    }

    static void task3 (int number) {
      if (number > 0) System.out.println("polojitelnoe"); else System.out.println("otricatelnoe");

    }
    static boolean task4 (int number) {

        return number > 0;
    }
    static String task5 (String name) {
        String result = "Привет, " + name + "!";
        System.out.println(result);
        return result;
    }
    static void task6 (int year) {

        if (((year%100 != 0) & (year % 4 == 0)) || (year%400 == 0)) System.out.println("Visokosniy"); else System.out.println("NeVisokosniy");
    }
}