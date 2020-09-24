package main.java.com.borlok.javacore.chapter13;
/**
 * Демонстрация assert (только с включенным режимом проверки утверждений)
 * Нужен только для отладки программ, его плюсом является то, что на стадии
 * окончательного вида программы, можно не удалять его.
 * -еа : As sertDelllo... - включить режим проверки утверждений
 * -dа : As sertDelllo... - выключить режим проверки утверждений
 */
public class AssertDemo11 {
    static int value = 3;

    static int getValue() {
        return value--;
    }
}
