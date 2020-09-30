package main.java.com.borlok.javacore.chapter20;

import java.io.*;

/**
 * Применение сериализации и десериализации
 */
public class SerializationDemo21 {
    public SerializationDemo21() {

        try (ObjectOutputStream objectOS = new ObjectOutputStream(
                new FileOutputStream("serial"))){
            MyClass myClass = new MyClass("Alex", 32, 2.7e10);
            System.out.println("myClass: " + myClass);

            objectOS.writeObject(myClass);
            
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Проблема ввода-вывода: " + e);
        }
        try(ObjectInputStream objIS = new ObjectInputStream(new FileInputStream("serial"))) {
            MyClass myClass2 = (MyClass) objIS.readObject();
            System.out.println("myClass2: " + myClass2);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Проблема ввода-вывода: " + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
