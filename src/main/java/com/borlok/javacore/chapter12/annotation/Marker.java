package com.borlok.javacore.chapter12.annotation;

import java.lang.reflect.Method;

public class Marker {
    @MyMarker
    public static void myMeth() {
        Marker marker = new Marker();

        try {
            Method myMeth = marker.getClass().getMethod("myMeth");
            if (myMeth.isAnnotationPresent(MyMarker.class))
                System.out.println("Маркерная аннотация присутствует");

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
