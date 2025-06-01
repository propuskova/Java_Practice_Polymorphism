package ru.сourses.student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;


public final class Student {
    private List<Integer> grades = new ArrayList<>();
    String name;
    private IntPredicate gradeValidator;

    public Student(String name, IntPredicate gradeValidator) {
        this.name = name;
        this.gradeValidator = gradeValidator;
    }

    public void addGrade(int grade) {
        if (gradeValidator.test(grade)) {
            grades.add(grade);
        }
    }
}