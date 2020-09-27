package main.java.com.borlok.javacore.chapter15.lambda;

/**
 * Пример лямбда-выражения с двумя параметрами
 */
public class LambdaWith2Parameters3 {
    public LambdaWith2Parameters3() {
        NumericTest2 num = (i,j) -> (i % j) == 0;
        int x = 10;
        int y = 3;
        if (num.test(x,y))
            System.out.println("Число " + y + " является множителем числа " + x);
        if (!num.test(x,y))
            System.out.println("Число " + y + " не является множителем числа " + x);
    }
}
