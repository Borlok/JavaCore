package com.borlok.javacore.reflection;

import java.io.Serializable;

public class TestReflection extends SuperClassReflection implements Serializable {
    private String name;
    public int age = 22;

    public TestReflection() {
    }

    public TestReflection(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, незнакомец");
    }

    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    private String sayGoodbye () {
        System.out.println("Goodbye!");
        return "Goodbye!";
    }

    private String sayGoodbye (int i) {
        System.out.println("Goodbye! " + i);
        return "Goodbye! " + i;
    }

    private String sayGoodbye (int i, long z) {
        System.out.println("Goodbye! int: " + i + " long: " + z);
        return "Goodbye! int: " + i + " and long: " + z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestReflection{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
