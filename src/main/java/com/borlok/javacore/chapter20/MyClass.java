package com.borlok.javacore.chapter20;

import java.io.Serializable;

public class MyClass implements Serializable {
    private String name;
    private int age;
    private double height;

    public MyClass(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
