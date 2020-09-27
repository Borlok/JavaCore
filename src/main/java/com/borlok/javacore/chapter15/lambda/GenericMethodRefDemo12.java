package main.java.com.borlok.javacore.chapter15.lambda;

/**
 * Применение лямбды на обобщенный метод
 */
public class GenericMethodRefDemo12 {
    static <T> int myOp(MyFunk2<T> func, T [] arr, T val) {
        return func.func(arr,val);
    }

    public GenericMethodRefDemo12() {
        Integer [] valls = {1,1,2,8,7,9,6,5,4,5,2,4,5,1,5,3,6,4};
        String [] strs = {"One", "Two", "Three", "Two"};
        int count = myOp(MyArrayOps12::<Integer>countMatching,valls, 4);
        System.out.println("Число 4 встречается: " + count + " раз");
        count = myOp(MyArrayOps12::<String>countMatching,strs, "Two");
        System.out.println("Слово Two встречается: " + count + " раз");
    }
}
