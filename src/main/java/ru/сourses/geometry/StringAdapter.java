package ru.сourses.geometry;

// Адаптер: оборачивает строку и реализует Measurable
public class StringAdapter implements Measurable {
    private String str;

    public StringAdapter(String str) {
        this.str = str;
    }

    @Override
    public double getLength() {
        return str.length();
    }

    @Override
    public String toString() {
        return "String[" + str + "]";
    }
}
