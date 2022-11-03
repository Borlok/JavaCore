package com.borlok.javacore.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericClassDemo<T extends Number> {
    private T one;
    private T two;

    public void sum(List<T> nums) {
        double result = 0;
        for (Number number : nums) {
            result += number.doubleValue();
        }
        System.out.println("Sum of numbers is: " + result);
    }

    public void sumWithAnythingType(List<? extends Number> nums) {
        double result = 0;
        for (Number number : nums) {
            result += number.doubleValue();
        }
        System.out.println("Sum of numbers is: " + result);
    }

    public T getNum(List<T> nums, Class<T> numClass) {
        double result = 0;
        for (T num : nums)
            result += num.doubleValue();
        return numClass.cast(result);
    }

    public void copyArray(List<? extends T> fromList, ArrayList<? super T> toList) {
        toList.addAll(fromList);
        System.out.println("Old list: " + fromList);
        System.out.println("New list: " + toList);
    }
}
