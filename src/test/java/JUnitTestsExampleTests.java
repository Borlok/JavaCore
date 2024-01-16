import model.Calculator;
import model.Service;
import model.User;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

/**
 * @author Erofeevskiy Yuriy on 16.01.2024
 */

public class JUnitTestsExampleTests {

    private Calculator calculator;
    private User user;
    private Service service;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        user = new User();
        service = new Service();
    }

    @Test
    @DisplayName("Умножение")
    void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5),
                "Обычное умножение");
    }

    @RepeatedTest(5)
    @DisplayName("Обработка нолей")
    void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(0, 5), "Multiple with zero should be zero");
        assertEquals(0, calculator.multiply(5, 0), "Multiple with zero should be zero");
    }
    @Test
    void exceptionTesting() {
        // set up user
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> user.setAge(101));
        assertEquals("Возраст слишком большой", exception.getMessage());
    }

    @Test
    void groupedAssertions() {
        User address = new User();
        address.setName("John");
        address.setLastName("User");
        assertAll("user name",
                () -> assertEquals("John", address.getName()),
                () -> assertEquals("User", address.getLastName())
        );
    }

    @Test
    @DisplayName("Проверяет укладывается ли выполнение метода во времени")
    void timeoutNotExceeded() {
        assertTimeout(ofSeconds(1), () -> service.doLongTime());
    }
    @Test
    @DisplayName("Проверяет укладывается ли выполнение метода во времени С возвращающим значением")
    void timeoutNotExceededWithResult() {
        String actualResult = assertTimeout(ofSeconds(1), () -> {
            return service.getString();
        });
        assertEquals("Hello", actualResult);
    }
    @Test
    @DisplayName("Отменяет, если не укладывается во времени")
    void timeoutNotExceededWithResultAndTimeLimit() {
        assertTimeoutPreemptively(ofSeconds(1), () -> service.doLongTime());
    }

    @RepeatedTest(5)
    @DisplayName("Пропуск теста с помощью Assumption")
    /**
     * Assumptions.assumeFalse помечает тест как недействительный, если его условие оценивается как true.
     * Assumptions.assumeTrue оценивает тест как недействительный, если его условие равно false
     */
    void testMultiplyWithZeroAndAssumption() {
        assumeFalse(true);

        assertEquals(calculator.multiply(0,5), 0, "Multiple with zero should be zero");
        assertEquals(calculator.multiply(5,0), 0, "Multiple with zero should be zero");
    }

    @RepeatedTest(5)
    @DisplayName("Пропуск теста с помощью Disabled")
    @Disabled("Тут пишем причину пропуска")
    void testMultiplyWithZeroAndDisabled() {
        assumeFalse(15 == 20);

        assertEquals(calculator.multiply(0,5), 0, "Multiple with zero should be zero");
        assertEquals(calculator.multiply(5,0), 0, "Multiple with zero should be zero");
    }

    @Test
    @DisplayName("Определение порядка Тестов")
    @Order(1)
    void firstOne() {
        assertTrue(true);
    }

    @Test
    @DisplayName("@TempDir аннотации позволяют аннотировать " +
            "непубличные поля или параметры метода в тестовом методе типа Path или File. Так же приведет к удалению временных файлов каждого теста")
    void hashTwoDynamicDirectoryWhichHaveSameContent(@TempDir Path tempDir, @TempDir Path tempDir2) throws IOException {

        Path file1 = tempDir.resolve("myfile.txt");

        List<String> input = Arrays.asList("input1", "input2", "input3");
        Files.write(file1, input);

        assertTrue(Files.exists(file1), "File should exist");

        Path file2 = tempDir2.resolve("myfile.txt");

        Files.write(file2, input);
        assertTrue(Files.exists(file2), "File should exist");

    }
}
