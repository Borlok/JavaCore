package main.java.com.borlok.javacore.chapter15.lambda;

/**
 * Реализация простой фабрики при помощи лямбды
 */
public class ConstructorRefDemo316 {
    static <R, T> R myClassFactory (MyFunc5<R,T> func, T t){
        return func.func(t);
    }
    public ConstructorRefDemo316() {
        MyFunc5<MyClass14<Integer>, Integer> myIntClass = MyClass14<Integer>::new;
        MyFunc5<MyClass15, String> myStringClass = MyClass15::new;

        MyClass14<Integer> intClass = myClassFactory(myIntClass,15);
        MyClass15 stringClass = myClassFactory(myStringClass, "Hello");

        System.out.println("Значение обобщенного класса = " + intClass.getVal());
        System.out.println("Значение обычного класса = " + stringClass.getVal());
    }
}
