package com.borlok.javacore.chapter10;

/**
 * Применение нескольких операторов catch
 */
public class MultipleCatchesException3 {
    public MultipleCatchesException3(int length) {
        try {
            int a = length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int[] c = {1};
            c[42] = 99;
        }catch (ArithmeticException e){
            System.out.println("Деление на ноль: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива " + e);
        }
        System.out.println("Код после блоков try/catch");
    }
}
