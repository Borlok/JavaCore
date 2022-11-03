package com.borlok.javacore.chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Применение очереди последовательного ввода
 */
public class InputStreamEnumerator11 implements Enumeration<FileInputStream> {
    private Enumeration<String> files;

    public InputStreamEnumerator11 (Vector<String> files) {
        this.files = files.elements();
    }

    @Override
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        try{
            return new FileInputStream(files.nextElement().toString());
        } catch (FileNotFoundException e) {
            return null;
        }
    }
}
