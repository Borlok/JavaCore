package com.borlok.javacore.reflection.proxylib;

import com.borlok.javacore.reflection.proxylib.MyInterceptor;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.MethodDelegation;
import org.mockito.cglib.proxy.Enhancer;
import org.mockito.cglib.proxy.MethodInterceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class ProxyLibsDemo {
    public void userJdkProxyTest() {
        User user = new User("Вася");

        InvocationHandler handler = (proxy, method, args) -> {
            if(method.getName().equals("getName")){
                return ((String)method.invoke(user, args)).toUpperCase();
            }
            return method.invoke(user, args);
        };

        IUser userProxy = (IUser) Proxy.newProxyInstance(user.getClass().getClassLoader(), User.class.getInterfaces(), handler);
        System.out.println(userProxy.getClass());
    }

    public void userCGLibTest() {
        User user = new User("Вася");

        MethodInterceptor handler = (obj, method , args, proxy) -> {
            if(method.getName().equals("getName")){
                return ((String)proxy.invoke(user, args)).toUpperCase() ;
            }
            return proxy.invoke(user, args);
        };

        User userProxy = (User) Enhancer.create(User.class, handler);
        System.out.println(userProxy.getClass());
    }

    public void userByteBuddyTest() {
        User user = new User("Вася");

        User userProxy = null;
        try {
            userProxy = new ByteBuddy()
                    .subclass(User.class)
                    .method(named("getName"))
                    .intercept(MethodDelegation.to(new MyInterceptor(user)))
                    .make()
                    .load(User.class.getClassLoader())
                    .getLoaded()
                    .getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(userProxy.getClass());
    }
}
