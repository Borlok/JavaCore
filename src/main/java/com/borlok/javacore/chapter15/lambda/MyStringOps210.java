package com.borlok.javacore.chapter15.lambda;

public class MyStringOps210 {
    public String strReverse(String text) {
        String result = "";
        for (int i = text.length()-1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }
}
