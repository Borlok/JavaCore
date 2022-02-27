package main.java.com.borlok.javacore.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        // Получение объекта рефлексии по полному названию
        Class<?> testReflection =
                Class.forName("main.java.com.borlok.javacore.reflection.TestReflection");
        // Получение класса если знаем класс
        Class<?> testReflection2 = TestReflection.class;

        String fullName = testReflection.getName(); // Получение полного имени класса
        String shortName = testReflection.getSimpleName(); // Получение короткого имени класса

        // ===============Модификаторы доступа=====================
        int modifiers = testReflection.getModifiers(); // Получение модификаторов доступа в виде интового значения

        //        Проверить интовый модификатор доступа можно следующими методами
        System.out.println("isAbstract: " + Modifier.isAbstract(modifiers));
        System.out.println("isFinal: " + Modifier.isFinal(modifiers));
        System.out.println("isInterface: " + Modifier.isInterface(modifiers));
        System.out.println("isNative: " + Modifier.isNative(modifiers));
        System.out.println("isPrivate: " + Modifier.isPrivate(modifiers));
        System.out.println("isProtected: " + Modifier.isProtected(modifiers));
        System.out.println("isPublic: " + Modifier.isPublic(modifiers));
        System.out.println("isStatic: " + Modifier.isStatic(modifiers));
        System.out.println("isStrict: " + Modifier.isStrict(modifiers));
        System.out.println("isSynchronized: " + Modifier.isSynchronized(modifiers));
        System.out.println("isTransient: " + Modifier.isTransient(modifiers));
        System.out.println("isVolatile: " + Modifier.isVolatile(modifiers));
///////////////////////////////////////
        Package testRefPackage = testReflection2.getPackage(); // Получаем информацию о пакете
        Class<?> superClass = testReflection.getSuperclass(); // Получаем его суперкласс
        Class<?>[] interfaces = testReflection.getInterfaces(); // Получаем реализуемые интерфейсы
        Constructor<?>[] constructors = testReflection.getConstructors(); // Получение конструкторов
        Constructor<?> constructor =
                testReflection.getConstructor(new Class<?>[]{String.class, int.class}); // Конкретный конструктор
        Class<?>[] parameterTypes = constructor.getParameterTypes(); // Получение параметров конструктора

        System.out.println("===========Исходя из полученных данных создаем объект через второй конструктор============");
        // Получаем конструктор и создаем на его основе новый объект
        Constructor<?> constructor1 = testReflection.getConstructor(String.class, int.class);
        TestReflection gottenObjectFromReflection = (TestReflection) constructor1.newInstance("Yurii", 33);
        System.out.println(gottenObjectFromReflection);

        System.out.println(
                "Класс: " + testReflection +
                        " \nfullName: " + fullName +
                        " \nshortName: " + shortName +
                        " \nmodifiers num: " + modifiers +
                        " \npackage: " + testRefPackage +
                        " \nsuperClass: " + superClass +
                        " \ninterfaces: " + Arrays.toString(interfaces) +
                        " \nconstructors: " + Arrays.toString(constructors) +
                        " \nsecond constructor with parameters: " + constructor +
                        " \nparameterTypes of constructor: " + Arrays.toString(parameterTypes)
        );
        System.out.println("///////////////////Работа с поллями.................");
        ///////////////////////////////////////
        Field[] fields = testReflection.getFields(); // Поля класса но только с public модификатором
        Field field = testReflection.getField("age"); // Получаем поле
        String fieldName = field.getName(); // Получаем имя поля
        Object fieldType = field.getType(); // Получаем тип поля
        int gottenField = (int) field.get(gottenObjectFromReflection);// Получаем значение поля
        System.out.println("public Fields: " + Arrays.toString(fields) +
                " \nfield: " + field +
                " \nfieldName: " + fieldName +
                " \nfieldType: " + fieldType +
                " \ngottenField: " + gottenField

        );
        field.set(gottenObjectFromReflection, 14); // Установка значения поля
        System.out.println("===========Исходя из полученных данных создаем объект============");
        System.out.println(gottenObjectFromReflection);
    }
}
