package main.java.com.borlok.javacore.chapter12.annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(RepeatableAnno.class)
public @interface RepeatableMyAnno {
    String str();
    int val();
}
