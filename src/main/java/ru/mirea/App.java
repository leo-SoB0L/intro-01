package ru.mirea;

import ru.mirea.sobolevle.Task1;
import ru.mirea.sobolevle.Task2;
import ru.mirea.sobolevle.Task3;
import ru.mirea.sobolevle.Task4;
import ru.mirea.sobolevle.Task5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Задание 1. Введите строку: ");
        String text = input.nextLine();
        System.out.println(new Task1().answer(text));


        System.out.print("Задание 2. Введите размер массива N: ");
        int n = Integer.parseInt(input.nextLine().trim());
        System.out.println(Arrays.toString(new Task2().answer(n)));


        Task3 task3 = new Task3();
        System.out.println("Задание 3. Уровни: " + Arrays.toString(task3.getLevels()));
        System.out.print("Введите идентификатор уровня (1-30): ");
        int id = Integer.parseInt(input.nextLine().trim());
        System.out.println(task3.answer(id));


        System.out.print("Задание 4. Введите длину массивов N: ");
        int len = Integer.parseInt(input.nextLine().trim());
        Random random = new Random();
        int[] first = new int[len];
        int[] second = new int[len];
        for (int i = 0; i < len; i++) {
            first[i] = random.nextInt(91) + 10; // от 10 до 100
            second[i] = random.nextInt(91) + 10;
        }
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println(new Task4().answer(first, second));


        System.out.print("Задание 5. Введите строку: ");
        String line = input.nextLine();
        System.out.print("Введите разделитель: ");
        String delimiter = input.nextLine();
        System.out.println(Arrays.toString(new Task5().answer(line, delimiter)));
    }
}
