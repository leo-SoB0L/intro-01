package ru.mirea.sobolevle;

public class Task4 {
    public int answer(int[] first, int[] second) {
        int max = Integer.MIN_VALUE;
        for (int v : first) {
            if (v > max) {
                max = v;
            }
        }
        for (int v : second) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }
}
