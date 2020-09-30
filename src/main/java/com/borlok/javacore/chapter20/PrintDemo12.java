package main.java.com.borlok.javacore.chapter20;

/**
 * Демонстрация метода printf() :: PrintStream
 */
public class PrintDemo12 {
    public PrintDemo12() {
        System.out.println("Ниже приведены некоторые числовые данные в разных форматах.\n");
        System.out.printf("Разные целочисленные форматы: ");
        System.out.printf("%d %(d %+d %05d\n", 3,-3,3,3);
        System.out.println();
        System.out.printf("Формат чисел с плавающей точкой по умолчанию: %f\n", 1234567.123);
        System.out.printf("Формат чисел с плавающей точкой разделяемых запятыми: %,f\n", 1234567.123);
        System.out.printf("Формат отрицательных чисел с плавающей точкой разделяемых запятыми: %,f\n", -1234567.123);
        System.out.printf("Другой формат отрицательных чисел с плавающей точкой разделяемых запятыми: %,(f\n", -1234567.123);
        System.out.println();
        System.out.printf("Выравнивание положительных и отрицательных числовых значений:\n");
        System.out.printf("% ,.2f\n% ,.2f\n", 1234567.123,-1234567.123);
    }
}
