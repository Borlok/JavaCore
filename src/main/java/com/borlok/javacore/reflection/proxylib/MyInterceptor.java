package com.borlok.javacore.reflection.proxylib;

public  class MyInterceptor {
    private User user;

    public MyInterceptor(User user) {
        this.user = user;
    }

    public String getName() {
        return user.getName().toUpperCase();
    }
}
