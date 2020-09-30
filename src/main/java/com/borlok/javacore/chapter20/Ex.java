package main.java.com.borlok.javacore.chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream("./src/main/java/com/borlok/javacore/chapter20/FileInputStreamDemo4.java")) {
            byte [] a = new byte[inputStream.available()/2];
            inputStream.read(a);
            System.out.println(new String(a,0,a.length));
            System.out.println("Следующая часть");
            for (int i = 0; i < inputStream.available(); i++) {
                System.out.print((char)inputStream.read());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
