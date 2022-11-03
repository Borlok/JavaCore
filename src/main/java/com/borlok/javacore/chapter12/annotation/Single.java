package com.borlok.javacore.chapter12.annotation;

import java.lang.reflect.Method;

public class Single {

    @MySingle(100)
    public static void myMeth() {
        Single single = new Single();
        try {
            Method method = single.getClass().getMethod("myMeth");
            if (method.isAnnotationPresent(MySingle.class))
                System.out.println("Method has a single value annotation with value "
                        + method.getAnnotation(MySingle.class).value());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
