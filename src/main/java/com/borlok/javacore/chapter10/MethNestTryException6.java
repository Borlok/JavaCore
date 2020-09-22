package main.java.com.borlok.javacore.chapter10;

/**
 * Пример применения вложеных операторов try
 */
public class MethNestTryException6 {
    public MethNestTryException6(int a) {
            try {
                if (a == 1) a = a / (a - a); // Деление на ноль (обработается во внешнем операторе catch)

                if (a == 2) { // Выход за границы массива, исключение происходит во внутреннем обработчике
                    int [] c = {1};
                    c[42] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Выход за границы массива " + e);
            }
    }
}

