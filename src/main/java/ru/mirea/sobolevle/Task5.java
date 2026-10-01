package ru.mirea.sobolevle;

import java.util.regex.Pattern;

public class Task5 {
    public String[] answer(String text, String delimiter) {

        return text.split(Pattern.quote(delimiter), -1);
    }
}
