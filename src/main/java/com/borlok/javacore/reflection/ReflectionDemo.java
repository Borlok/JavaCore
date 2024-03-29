package com.borlok.javacore.reflection;

import com.borlok.javacore.reflection.proxylib.ProxyLibsDemo;

import java.lang.reflect.*;
import java.util.Arrays;

public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        // Получение объекта рефлексии по полному названию
        Class<?> testReflection =
                Class.forName("com.borlok.javacore.reflection.TestReflection");
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
                testReflection.getConstructor(String.class, int.class); // Конкретный конструктор
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
        System.out.println("///////////////////Работа с pulbic полями.................");
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
        System.out.println("///////////////////Работа с методами.................");
        Method [] methods = testReflection.getMethods();// Получение всех методов
        Method method =
                testReflection.getMethod("sayHello", String.class); // Получение одного метода с параметрами
        Method method2 =
                testReflection.getMethod("sayHello", null); // Получение одного метода без параметров
        Class<?>[] methodParameterTypes = method.getParameterTypes(); // Типы параметров метода
        Class<?> methodReturnType = method.getReturnType(); // Возвращаемый тип метода
        Method declaredMethod = testReflection.getDeclaredMethod("sayHello", String.class);
        System.out.println("=============Вызов метода===========");
        declaredMethod.invoke(new TestReflection(), "Yurii"); // Вызов метода

        System.out.println("methods: " + Arrays.toString(methods) +
                " \nmethod: " + method +
                " \nmethod2: " + method2 +
                " \nmethodParameterTypes: " + Arrays.toString(methodParameterTypes) +
                " \nmethodReturnType: " + methodReturnType

        );

        System.out.println("==========Доступ к private полям с помощью рефлексии==========");
        Field privateField = testReflection.getDeclaredField("name"); // Получение филда private
        privateField.setAccessible(true); // Установить разрешение доступа к полю
        String privateDeclaredField = (String) privateField.get(new TestReflection()); // Получение значения приватного филда
        System.out.println("privateField: " + privateField +
                " \nprivateDeclaredField: " + privateDeclaredField
        );
        System.out.println("==========Доступ к private методам с помощью рефлексии==========");
        Method privateStringMethod = testReflection.getDeclaredMethod("sayGoodbye"); // Получаем закрытый метод
        privateStringMethod.setAccessible(true); // Отключаем проверку на приватность
        String returnValue = (String) privateStringMethod.invoke(new TestReflection(), null);
        System.out.println("значение, которое возвращает private метод = " + returnValue);

        Object [] arg = new Object[2];
        arg[0] = 32;
        arg[1] = 67;
        Class<?> [] params = {int.class, long.class};
        privateStringMethod = testReflection.getDeclaredMethod("sayGoodbye", params); // Получаем закрытый метод c 2 аргументами
        privateStringMethod.setAccessible(true); // Отключаем проверку на приватность
        returnValue = (String) privateStringMethod.invoke(new TestReflection(), arg);
        System.out.println("значение, которое возвращает private метод c 2 аргументами = " + returnValue);
        System.out.println("==========Доступ к аннотациям с помощью рефлексии пока не написал==========");
        System.out.println("==========Массивы в рефлексии==========");
        System.out.println("==========Создание массива==========");
        int [] arr = (int[]) Array.newInstance(int.class, 2); // Создание
        Array.set(arr, 0, 111); // добавление
        Array.set(arr, 1, 222);

        System.out.println("первый элемент массива = " + Array.get(arr, 0));
        System.out.println("второй элемент массива = " + Array.get(arr, 1));
        System.out.println("Получение класса");

        Class<?> intArrayObject = Util.getClass(arr.getClass().getName());
        System.out.println("Обобщенный класс: " + intArrayObject); // Обобщенный класс

        Class<?> arrayClass = arr.getClass();
        Class<?> arrayComponentType = arrayClass.getComponentType();
        System.out.println("Уточненный тип массива: " + arrayComponentType); // Уточненный тип массива

        System.out.println("==========Создание прокси объектов==========");
        System.out.println("==========JDKProxy==========");
        new ProxyLibsDemo().userJdkProxyTest();
        System.out.println("==========CGLIB==========");
        new ProxyLibsDemo().userCGLibTest();
        System.out.println("==========ByteBuddy==========");
        new ProxyLibsDemo().userByteBuddyTest();
    }
}
