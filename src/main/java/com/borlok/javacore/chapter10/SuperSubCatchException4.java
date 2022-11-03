package com.borlok.javacore.chapter10;

/**
 * Недостижимый код из-за неправильной расстановки операторов catch.
 * Этот код не скомпилируется, потому что ArithmeticException - производная от Exception.
 */
public class SuperSubCatchException4 {
    public SuperSubCatchException4() {
        try {
            int a = 0;
            int b = 42 / 0;
        } catch (Exception e) {
            System.out.println("Перехват исключения общего класса Exception.");
//        } catch (ArithmeticException e) { //Ошибочный код!
//            System.out.println("Этот класс недостижим.");
        }
    }
}
