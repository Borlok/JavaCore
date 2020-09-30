package main.java.com.borlok.javacore.chapter20;

import java.io.*;

/**
 * Применение DataInputStream и DataOutputStream
 */
public class DataIODemo13 {
    public DataIODemo13() {
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.dat"))) {
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

        try (DataInputStream din = new DataInputStream(new FileInputStream("Test.dat"))) {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();
            System.out.println("Получаемые значения: " + d + " " + i + " " + b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
