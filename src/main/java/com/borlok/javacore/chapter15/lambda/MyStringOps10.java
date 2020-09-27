package main.java.com.borlok.javacore.chapter15.lambda;

/**
 * Пример со ссылкой на статический метод
 * Данный класс совместим с лямбдой связанной с интерфейсом,
 * принимающим String и возвращающем String.
 */
public class MyStringOps10 {
    public static String strReverse(String text) {
        String result = "";
        for (int i = text.length()-1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }
}
