package com.borlok.javacore.chapter21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Применение метода walkFileTree
 */
public class DirTreeList11 {
    public DirTreeList11() {
        String dirName = "./";
        System.out.println("Дерево каталогов, начиная с " + dirName + ":\n");
        try {
            Files.walkFileTree(Paths.get(dirName), new MyFileVisitor());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
