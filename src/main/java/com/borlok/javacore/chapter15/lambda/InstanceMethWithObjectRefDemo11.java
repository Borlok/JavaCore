package com.borlok.javacore.chapter15.lambda;

/**
 * Пример лямбды, где параметрами выступают класс и параметр метода класса
 */
public class InstanceMethWithObjectRefDemo11 {
    static <T> int counter(T [] vals, MyFunc<T> f, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals [i], v)) count++;
        }
        return count;
    }

    public InstanceMethWithObjectRefDemo11() {
        int count;

        HighTemp11 [] weekDayHighs = {
                new HighTemp11(89), new HighTemp11(82),
                new HighTemp11(90), new HighTemp11(89),
                new HighTemp11(89), new HighTemp11(91),
                new HighTemp11(84), new HighTemp11(83),
        };

        count = counter(weekDayHighs, HighTemp11::sameTemp, new HighTemp11(89));
        System.out.println("Дней когда максимальная температура была 89: " + count);

        HighTemp11 [] weekDayHighs2 = {
                new HighTemp11(32), new HighTemp11(12),
                new HighTemp11(24), new HighTemp11(19),
                new HighTemp11(18), new HighTemp11(12),
                new HighTemp11(-1), new HighTemp11(13),
        };

        count = counter(weekDayHighs2, HighTemp11::sameTemp, new HighTemp11(12));
        System.out.println("Дней когда максимальная температура была 12: " + count);

        count = counter(weekDayHighs, HighTemp11::lessThanTemp, new HighTemp11(89));
        System.out.println("Дней когда максимальная температура была меньше 89: " + count);

        count = counter(weekDayHighs2, HighTemp11::lessThanTemp, new HighTemp11(19));
        System.out.println("Дней когда максимальная температура была меньше 19: " + count);

    }
}
