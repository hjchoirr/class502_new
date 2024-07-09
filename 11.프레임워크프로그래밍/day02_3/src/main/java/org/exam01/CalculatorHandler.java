package org.exam01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CalculatorHandler implements InvocationHandler {
    Object target;

    public CalculatorHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("공통부분1");
        try {
            return method.invoke(target, args);
        } finally {
            System.out.println("공통부분2");
        }
    }
}
