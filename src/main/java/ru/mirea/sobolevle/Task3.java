package ru.mirea.sobolevle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    private static final int SIZE = 15;
    private static final int MAX_ID = 30;

    private final int[] levels = new int[SIZE];

    public Task3() {

        List<Integer> ids = new ArrayList<>();
        for (int i = 1; i <= MAX_ID; i++) {
            ids.add(i);
        }
        Collections.shuffle(ids);
        for (int i = 0; i < SIZE; i++) {
            levels[i] = ids.get(i);
        }
    }

    public int[] getLevels() {
        return levels.clone();
    }

    public int answer(int id) {
        for (int i = 0; i < levels.length; i++) {
            if (levels[i] == id) {
                return i;
            }
        }
        return -1;
    }
}
