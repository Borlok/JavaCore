package main.java.com.borlok.javacore.chapter29;

public class NamePhone {
    String name;
    String phoneNum;

    public NamePhone(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "NamePhone{" +
                "name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
