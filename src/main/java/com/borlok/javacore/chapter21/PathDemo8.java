package main.java.com.borlok.javacore.chapter21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Получение о пути к файлу и самом файле
 */
public class PathDemo8 {
    public PathDemo8() {
         Path filePath = Paths.get("test.txt");
        System.out.println("Имя файла: " + filePath.getFileName());
        System.out.println("Путь к файлу: " + filePath);
        System.out.println("Абсолютный путь к файлу: " + filePath.toAbsolutePath());
        System.out.println("Родительский каталог: " + filePath.getParent());
        if (Files.exists(filePath)) {
            System.out.println("Файл существует");
        } else
            System.out.println("Файл не существует");
        try {
            if (Files.isHidden(filePath))
                System.out.println("Файл скрыт");
            else
                System.out.println("Файл не скрыт");
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (Files.isWritable(filePath))
            System.out.println("Файл доступен для записи");
        if (Files.isReadable(filePath))
            System.out.println("Файл доступен для чтения");
        try {
            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            if (attributes.isDirectory())
                System.out.println("Это дирректория");
            else
                System.out.println("Это не дирректория");
            if (attributes.isRegularFile())
                System.out.println("Это обычный файл");
            else
                System.out.println("Это не обычный файл");
            if (attributes.isSymbolicLink())
                System.out.println("Это символическая ссылка");
            else
                System.out.println("Это не символическая ссылка");
            System.out.println("Время последней модификации файла: " + attributes.lastModifiedTime());
            System.out.println("Размер файла: " + attributes.size() + " байт");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
