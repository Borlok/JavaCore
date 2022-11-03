package com.borlok.javacore.chapter10;

/**
 * Пример многократного перехвата
 */
public class MultiCatchException12 {
    public MultiCatchException12() {
        int a = 10, b = 0;
        int [] vals = {1,2,3};

        try {
            int result = a / b; // Если закомментировать, перехватится исключение ArrayIndexOutOfBoundsException

            vals [10] = 99;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение перехвачено: " + e);
        }
        System.out.println("После многократного перехвата");
    }
}
