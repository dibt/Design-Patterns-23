package com.di.dynamicproxy.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JDKDynamicProxyTest {
    public static void main(String[] args) {
        ITransportation realTransportation = new Bus();
        InvocationHandler handler = new JDKDynamicProxy(realTransportation);
        //一个类加载器对象和一个接口数组确定了一个代理类。
        ITransportation proxyTransportation = (ITransportation) Proxy.newProxyInstance(realTransportation.getClass().getClassLoader(),
                realTransportation.getClass().getInterfaces(),
                handler);
        proxyTransportation.move(proxyTransportation.getClass().getName());
    }
}
