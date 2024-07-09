package exam01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CalculatorHandler implements InvocationHandler {
    Object target;
    public CalculatorHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long stime = System.nanoTime();

        try {
            return method.invoke(target, args);
        } finally {
            long etime = System.nanoTime();
            System.out.println("걸린시간: " + (etime - stime));
        }

    }
}
