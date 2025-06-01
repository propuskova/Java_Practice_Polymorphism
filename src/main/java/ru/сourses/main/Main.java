package ru.сourses.main;

import ru.сourses.bird.*;
import ru.сourses.geometry.*;
import ru.сourses.fraction.*;
import ru.сourses.student.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //3
        System.out.println("\n\nЗадание 3");
        Line line = new Line(new Point(0, 0), new Point(3, 4));
        ClosedPolyLine closeLine = new ClosedPolyLine(new Point(0,0),
                new Point(3, 0), new Point(3,4));
        printLengths(line, closeLine);


        //4
        System.out.println("\n\nЗадание 4");
        StringAdapter stringWrap = new StringAdapter("Hello, world!");
        printLengths(line, closeLine, stringWrap);

        //6
        System.out.println("\n\nЗадание 6");
        Fraction f1 = new Fraction(2, 1);
        Fraction f2 = new Fraction(3, 5);
        Fraction f3 = new Fraction(23, 10);
        System.out.println("sum1 = " + sumAll(f1, f2, f3));

        Fraction f4 = new Fraction(36, 10);
        Fraction f5 = new Fraction(49, 12);
        Fraction f6 = new Fraction(3, 1);
        Fraction f7 = new Fraction(3, 2);
        System.out.println("sum2 = " + sumAll(f4, f5, f6, f7));

        Fraction f8 = new Fraction(1, 3);
        Fraction f9 = new Fraction(1, 1);
        System.out.println("sum3 = " + sumAll(f8, f9));

        //8
        System.out.println("\n\nЗадание 8");
        Bird b1 = new Sparrow();
        Bird b2 = new Cuckoo();
        Bird b3 = new Parrot("Попка дурак");
        singAll(b1, b2, b3);

        //10
        System.out.println("\n\nЗадание 10");
        Shape s1 = new Circle(new Point(0, 0), 1);
        Shape s2 = new Circle(new Point(5,5), 2);
        Shape s3 = new Square(new Point(3,3), 1);
        System.out.println(sumAllAreas(s1, s2, s3));

        //11
        System.out.println("\n\nЗадание 11");
        AbstractPoint p1 = new CoordinatePoint(3, 4);
        AbstractPoint p2 = new ColoredPoint(5, 6, "серо-буро-малиновый");
        AbstractPoint p3 = new TimePoint(1, 2, 3, "11:00");

        AbstractPoint[] points = {p1, p2, p3};
        for (AbstractPoint p : points) {
            System.out.println(p.getDescription());
        }

        //15
        System.out.println("\n\nЗадание 15");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите х - основание степени: ");
        String xStr = scanner.nextLine();
        System.out.println("\nВведите у - показатель степени: ");
        String yStr = scanner.nextLine();

        double result = power(xStr, yStr);
        System.out.println("\nРезультат: " + result);

        //16
        System.out.println("\n\nЗадание 16");
        Point customPoint = new Point(3, 4);                // наша точка из пакета geometry
        java.awt.Point awtPoint = new java.awt.Point(10, 20); // стандартная из Java

        System.out.println("Custom Point: " + customPoint);
        System.out.println("AWT Point: " + awtPoint);
    }


    public static void printLengths(Measurable... shapes) {
        for (Measurable shape : shapes) {
            System.out.println("Length: " + shape.getLength());
        }
    }

    public static double sumAll(Number... nums) {
        double sum = 0;
        for (Number n : nums) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void singAll(Bird... birds) {
        for (Bird b : birds) {
            b.sing();
            System.out.println("---");
        }
    }

    public static double sumAllAreas(Shape... shapes) {
        double total = 0;
        for (Shape s : shapes) {
            total += s.getArea();
        }
        return total;
    }

    public static double power(String xStr, String yStr) {
        int x = parseInt(xStr);
        int y = parseInt(yStr);
        return pow(x, y);
    }

    // Короткие имена статических методов
    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }

    public static double pow(int base, int exponent) {
        return Math.pow(base, exponent);
    }
}