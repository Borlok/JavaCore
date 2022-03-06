package main.java.com.borlok.javacore.annotation;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class AnnotationDemo {
    String author = "Petr";
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(new AnnotationDemo().toString());
        oldMethod();
        genericsTest();
    }

    @Override
    @FirstAnnotation(author = "Andrew", comments = "Main method", date = "Aug 10 2015", revision = 1)
    public String toString() {
        return "Переопределили метод toString() ";
    }

    @Deprecated
    @FirstAnnotation(comments = "устаревший метод", date = "Aug 10 2015")
    public static void oldMethod() {
        System.out.println("Этот метод не стоит дальше использовать");
    }

    @SuppressWarnings({ "unchecked", "deprecation" }) //это простой способ попросить компилятор игнорировать конкретные предупреждения, если они вдруг появятся.
    @FirstAnnotation(author = "Andrew", comments = "Main method", date = "Aug 10 2015", revision = 4)
    public static void genericsTest() throws FileNotFoundException {
        List<String> list = new ArrayList<>();
        list.add("first");
        oldMethod();
    }
}
