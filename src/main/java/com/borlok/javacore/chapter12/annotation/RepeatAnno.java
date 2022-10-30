package main.java.com.borlok.javacore.chapter12.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RepeatAnno {

    @RepeatableMyAnno(str = "First annotation", val = -1)
    @RepeatableMyAnno(str = "Second annotation", val = 100)
    public static void myMeth() {
        RepeatAnno anno = new RepeatAnno();
        try {
            Method method = anno.getClass().getMethod("myMeth");
            Annotation annotations = method.getAnnotation(RepeatableAnno.class);
            System.out.println(annotations);
            System.out.println("\nПолучение повторяющихся аннотаций по отдельности");
            RepeatableMyAnno[] annotationsByType = method.getAnnotationsByType(RepeatableMyAnno.class);
            for (RepeatableMyAnno repeatableMyAnno : annotationsByType) {
                System.out.println(repeatableMyAnno);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
