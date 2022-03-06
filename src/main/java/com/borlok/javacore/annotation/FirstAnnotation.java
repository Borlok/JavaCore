package main.java.com.borlok.javacore.annotation;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface FirstAnnotation {
    String author() default "Yurii";
    String date();
    int revision() default 1;
    String comments();
}
