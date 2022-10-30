package main.java.com.borlok.javacore.chapter12.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@interface TypeAnno {
}

@Target(ElementType.TYPE_USE)
@interface NotZeroLen {
}

@Target(ElementType.TYPE_USE)
@interface Unique {
}

@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value();
}

@Target(ElementType.TYPE_PARAMETER)
@interface What {
    String description();
}

@Target(ElementType.FIELD)
@interface EmptyOK {
}

@Target(ElementType.METHOD)
@interface Recommended {
}

class ТypeAnnoDemo<@What(description = "Данные обобщенного типа") T> {
    public @Unique ТypeAnnoDemo() {
    }

    @TypeAnno
    String str;
    @EmptyOK
    String test;

    public int f(@TypeAnno ТypeAnnoDemo<T>this, int x) {
        return 10;
    }

    public @TypeAnno Integer f2(int j, int k) {
        return j + k;
    }


    public @Recommended
    Integer fЗ(String str) {
        return str.length() / 2;
    }

    public void f4() throws @TypeAnno NullPointerException {
    }

    String @MaxLen(10) [] @NotZeroLen [] w;
    @TypeAnno Integer[] vec;

    public static void myMeth(int i) {
        new ТypeAnnoDemo<@TypeAnno Integer>();
        @Unique ТypeAnnoDemo<Integer> оЬ2 = new @Unique ТypeAnnoDemo<Integer>();
        Object x = 10;
        Integer у;
        у = (@TypeAnno Integer) x;
    }


    public static void main(String[] args) {
        myMeth(10);
    }

    class SomeClass extends @TypeAnno ТypeAnnoDemo<Boolean> {
    }
}
