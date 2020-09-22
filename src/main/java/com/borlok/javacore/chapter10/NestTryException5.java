package main.java.com.borlok.javacore.chapter10;

/**
 * Пример применения вложеных операторов try
 */
public class NestTryException5 {
    public NestTryException5(int length) {
        try {
            int a = length;
            int b = 42 / a;
            System.out.println("a = " + a);
            try {
                if (a == 1) a = a / (a - a); // Деление на ноль (обработается во внешнем операторе catch)

                if (a == 2) { // Выход за границы массива, исключение происходит во внутреннем обработчике
                    int [] c = {1};
                    c[42] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Выход за границы массива " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e);
        }
    }
}
