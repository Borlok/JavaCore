package main.java.com.borlok.javacore.generic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <? extends Type> only reading and add(null)
 * <? super Type> only writing and get(Object)
 * <?> == <? extends Object>
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(1,2,3));
        new GenericClassDemo<Integer>().sum(integerList); // Generic class as a Number subtype
        new GenericClassDemo<Number>().sumWithAnythingType(integerList); // Generic class as a <? extends Number> subtype in the method arguments
        System.out.println(new GenericClassDemo<Double>().getNum(List.of(1.0,2.0,3.0), Double.class)); // Demo with returned T type
        new GenericClassDemo<Integer>().copyArray(List.of(1,2,3), new ArrayList<>());// Demo reading and writing generic Type
        /// Covariant collection with generic////
        Set<Integer> set = new HashSet<>();
        Set<? extends Number> covariantSet = set;
        /// Invariant collection ///
        Set<Integer> integers = new HashSet<>();
//        Set<Number> numbers = integers; // Compile Error
    }
}
