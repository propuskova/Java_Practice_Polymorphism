package ru.сourses.bird;

import java.util.Random;

public class Parrot extends Bird {
    private String text;

    public Parrot(String text) {
        this.text = text;
    }

    public void sing() {
        int n = new Random().nextInt(text.length()) + 1;
        System.out.println(text.substring(0, n));
    }
}
