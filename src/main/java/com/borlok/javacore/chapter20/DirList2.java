package com.borlok.javacore.chapter20;

import java.io.File;

/**
 * Использование каталогов
 */
public class DirList2 {

    public DirList2() {
        String dirName = "./Java";
        File f1 = new File(dirName);

        if (f1.isDirectory()) {
            System.out.println("Каталог: " + dirName);
            String [] filesList = f1.list();
            for (String file : filesList) {
                File f = new File(dirName + "/" + file);
                if (f.isDirectory())
                    System.out.println(file + " является каталогом");
                else
                    System.out.println(file + " не является каталогом");
            }
        } else System.out.println(dirName + " не является каталогом");

    }
}
