package model;

/**
 * @author Erofeevskiy Yuriy on 16.01.2024
 */


public class Service {

    public void doLongTime() {
        int x = 900000;
        for (int i = 0; i < x; i++) {
            System.out.println(i); // TODO Delete
        }
    }

    public String getString() {
        return "Hello";
    }
}
