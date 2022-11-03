package com.borlok.javacore.chapter12.annotation;

import java.lang.reflect.Method;

public class Meta {
    @MyAnno(str="Пример аннотации", val = 100)
    public static void myMeth(String str, int i) {
        System.out.println("Пример аннотированного метода с двумя параметрами и паратрметризированной аннотацией");
        Meta meta = new Meta();
        try {
        Class<? extends Meta> metaClass = meta.getClass();
            Method method = metaClass.getMethod("myMeth", String.class, int.class);
            MyAnno anno = method.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @MyAnno()
    public static void myMeth2() {
        System.out.println("\nПример аннотированного метода без параметров и аннотацией с параметрами по умоляанию");
        Meta meta = new Meta();
        try {
            Class<? extends Meta> metaClass = meta.getClass();
            Method method = metaClass.getMethod("myMeth2");
            MyAnno anno = method.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        myMeth("Test", 10);
        myMeth2();
    }
}
