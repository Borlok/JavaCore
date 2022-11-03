package com.borlok.javacore.chapter10;

/**
 * Применение оператора Finally
 */
public class FinallyDemoException9 {
    static void procA() {
        try { // Генерация исключения в методе
            System.out.println("В теле метода procA");
            throw new RuntimeException("Демонстрация");
        } finally {
            System.out.println("Блок оператора Finally в методе procA");
        }
    }

    static void procB () {
        try { // Возврат управления из блока try при помощи return
            System.out.println("В теле метода procB");
            return;
        } finally {
            System.out.println("Блок оператора Finally в методе procB");
        }
    }

    static void procC () {
        try { // Обычное применение блока try
            System.out.println("В теле метода procC");
        } finally {
            System.out.println("Блок оператора Finally в методе procC");
        }
    }

}
