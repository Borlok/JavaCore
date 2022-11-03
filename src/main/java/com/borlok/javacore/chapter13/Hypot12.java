package com.borlok.javacore.chapter13;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
/**
 * Применение static import
 * он позволяет вызывать статические методы без указания класса, которому методы принадлежат
 */
public class Hypot12 {
    public Hypot12() {
        double side1, side2, hypot;

        side1 = 3D;
        side2 = 4D;

        // Вместо hypot = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2)) при применении статического импорта
        hypot = sqrt(pow(side1,2) + pow(side2,2));
        System.out.println("При заданной длинне сторон " + side1 + " и "
                + side2 + " гипотенуза равна " + hypot);
    }
}
