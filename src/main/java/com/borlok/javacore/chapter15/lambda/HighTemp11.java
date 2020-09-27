package main.java.com.borlok.javacore.chapter15.lambda;

public class HighTemp11 {
    private int hTemp;

    public HighTemp11(int hTemp) {
        this.hTemp = hTemp;
    }

    boolean sameTemp(HighTemp11 ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThanTemp (HighTemp11 ht2) {
        return hTemp < ht2.hTemp;
    }
}
