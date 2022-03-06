package main.java.com.borlok.javacore.reflection;

public class Util {

    public static Class<?> getClass(String className) throws ClassNotFoundException {
        if ("int".equals(className))
            return int.class;
        return Class.forName(className);
    }
}
