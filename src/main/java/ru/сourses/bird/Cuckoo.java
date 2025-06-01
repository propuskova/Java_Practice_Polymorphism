package ru.сourses.bird;

import java.util.Random;

//кукушка
public class Cuckoo extends Bird {
    public void sing() {
        int times = new Random().nextInt(10) + 1;
        for (int i = 0; i < times; i++) {
            System.out.println("ку-ку");
        }
    }
}
