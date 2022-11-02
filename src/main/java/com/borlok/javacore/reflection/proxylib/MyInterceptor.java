package com.borlok.javacore.reflection.proxylib;

public  class MyInterceptor {
    main.java.com.borlok.javacore.reflection.proxylib.User user;

    public MyInterceptor(main.java.com.borlok.javacore.reflection.proxylib.User user) {
        this.user = user;
    }

    public String getName() {
        return user.getName().toUpperCase();
    }
}
