import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

/**
 * @author Erofeevskiy Yuriy on 16.01.2024
 * JUnit 5 поддерживает создание динамических тестов с помощью кода.
 * Вы также можете запускать тесты с набором различных входных значений с помощью параметризованных тестов.
 */


public class DynamicTestCreationTest {
    @TestFactory
    Stream<DynamicTest> testDifferentMultiplyOperations() {
        MyClass tester = new MyClass();
        int[][] data = new int[][] { { 1, 2, 2 }, { 5, 3, 15 }, { 121, 4, 484 } };
        return Arrays.stream(data).map(entry -> {
            int m1 = entry[0];
            int m2 = entry[1];
            int expected = entry[2];
            return dynamicTest(m1 + " * " + m2 + " = " + expected, () -> {
                assertEquals(expected, tester.multiply(m1, m2));
            });
        });
    }

    /**
     * Junit5 также поддерживает параметризованные тесты.
     * Чтобы использовать их, вы должны добавить junit-jupiter-params пакет в качестве тестовых зависимостей.
     * Они позволяют принимать в тесты параметры
     * Источники тестовых данных
     * @MethodSource(value =  "data")
     * @ValueSource(ints = { 1, 2, 3 })
     * @EnumSource(value = Months.class, names = {"JANUARY", "FEBRUARY"}) - Позволяет передавать константы Enum в качестве тестового класса.
     * @MethodSource(names = "genTestData") - Результат работы именованного метода передается в качестве аргумента тесту.
     * @ArgumentsSource(MyArgumentsProvider.class) - Указывает класс, который предоставляет тестовые данные. Класс, на который ссылается, должен реализовывать ArgumentsProvider интерфейс.
     * @CsvSource({ "foo, 1", "'baz, qux', 3" })
     * void testMethod(String first, int second) { - Ожидает, что строки будут проанализированы как Csv. Разделителем является ','.
     */

    public static int[][] data() {
        return new int[][] { { 1 , 2, 2 }, { 5, 3, 15 }, { 121, 4, 484 } };
    }
    @ParameterizedTest
    @MethodSource(value =  "data")
    void testWithStringParameter(int[] data) {
        MyClass tester = new MyClass();
        int m1 = data[0];
        int m2 = data[1];
        int expected = data[2];
        assertEquals(expected, tester.multiply(m1, m2));
    }

    // class to be tested
    class MyClass {
        public int multiply(int i, int j) {
            return i * j;
        }
    }

}
