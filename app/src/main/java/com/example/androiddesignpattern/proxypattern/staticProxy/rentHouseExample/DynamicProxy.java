package com.example.androiddesignpattern.proxypattern.staticProxy.rentHouseExample;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author jere
 * <p>
 * 动态代理类
 */
public class DynamicProxy implements InvocationHandler {
    //被代理类
    private Object object;

    public DynamicProxy(Object o) {
        this.object = o;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用被代理类对象的方法
        return method.invoke(object, args);

    }
}
