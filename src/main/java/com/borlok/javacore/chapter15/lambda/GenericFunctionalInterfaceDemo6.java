package main.java.com.borlok.javacore.chapter15.lambda;

/**
 * Применение обоьщенного функционального интерфейса
 */
public class GenericFunctionalInterfaceDemo6 {
    public GenericFunctionalInterfaceDemo6() {
        SomeFunc<String> reverse = x -> {
            StringBuilder result = new StringBuilder();
            for (int i = x.length()-1; i >= 0 ; i--) {
                result.append(x.charAt(i));
            }
            return result.toString();
        };
        System.out.println("Слово Факториал обращается в " + reverse.func("Факториал"));

        SomeFunc<Integer> factorial = x -> {
            int result = 1;
            for (int i = 1; i <= x; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println("Факториал числа 5 - это " + factorial.func(5));
    }
}
