package main.java.com.borlok.javacore.chapter12.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@MyWhat(description="Тестовая аннотация класса")
@MyAnno(str = "Meta2", val = 99)
public class Meta2 {

    @MyWhat(description="Тестовая аннотация метода")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {
        try {
            Meta2 meta2 = new Meta2();
            Class<? extends Meta2> aClass = meta2.getClass();
            Annotation[] annotations = aClass.getAnnotations();
            System.out.println("Все аннотации для класса Meta2");
            for (Annotation annotation : annotations)
                System.out.println(annotation);

            Method method = aClass.getMethod("myMeth");
            annotations = method.getAnnotations();

            System.out.println("\nВсе аннотации для метода myMeth");
            for (Annotation annotation : annotations)
                System.out.println(annotation);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
