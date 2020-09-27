package main.java.com.borlok.javacore.chapter15.lambda;

/**
 * Применение блочного лямбда выражения 2
 */
public class BlockLambdaDemoString5 {
    public BlockLambdaDemoString5() {
        String word = "Привет";
        StringFunc reverse = x -> {
            StringBuilder result = new StringBuilder();
            for (int i = x.length()-1; i >= 0 ; i--) {
                result.append(x.charAt(i));
            }
            return result.toString();
        };

        System.out.println("Слово " + word + " обращается на " + reverse.func(word));
    }
}
