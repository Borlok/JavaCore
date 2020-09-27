package main.java.com.borlok.javacore.chapter15.lambda;

/**
 * Применение ссылки на конструктор на обобщенный класс
 */
public class ConstructorRefDemo215 {
    public ConstructorRefDemo215() {
        MyFunc4<Integer> myClass = MyClass14<Integer>::new;
        MyClass14<Integer> mc = myClass.func(99);
        System.out.println("Переменная val = " + mc.getVal());
        MyFunc4<String> myClassStr = MyClass14<String>::new;
        MyClass14<String> mcs = myClassStr.func("Hello");
        System.out.println(mcs.getVal());

    }
}
