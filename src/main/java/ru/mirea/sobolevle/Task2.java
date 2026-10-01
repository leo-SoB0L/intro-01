package ru.mirea.sobolevle;

import java.util.Random;

public class Task2 {
    private final Random random = new Random();

    public int[] answer(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = random.nextInt(201) - 100;
        }
        return result;
    }
}
