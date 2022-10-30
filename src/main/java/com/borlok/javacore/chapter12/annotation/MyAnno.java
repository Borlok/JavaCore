package main.java.com.borlok.javacore.chapter12.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str() default "ТЕСТИРОВАНИЕ";
    int val() default 9999;
}
