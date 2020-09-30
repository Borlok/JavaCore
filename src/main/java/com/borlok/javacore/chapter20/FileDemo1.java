package main.java.com.borlok.javacore.chapter20;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Применение класса File
 */
public class FileDemo1 {
    static void p(String s) {
        System.out.println(s);
    }
    public FileDemo1() throws IOException {
        File f1 = new File("./Java/copyright.txt");
        p("Имя файла " + f1.getName());
        p("Путь " + f1.getPath());
        p("Абсолютный путь " + f1.getAbsolutePath());
        p("Родительский каталог " + f1.getParent());
        p(f1.exists() ? "существует" : "Не существует");
        p(f1.canWrite() ? "Доступен для записи" : "Не доступен для записи");
        p(f1.canRead() ? "Доступен для чтения" : "Не доступен для чтения");
        p(f1.isDirectory() ? "Является каталогом" : "Не является каталогом");
        p(f1.isFile() ? "Является файлом" : "Не является файлом");
        p(f1.isAbsolute() ? "Является абсолютным" : "Не является абсолютным");
        p("Последнее изменение " + f1.lastModified());
        p("Размер " + f1.length() + " байт");


    }
}
