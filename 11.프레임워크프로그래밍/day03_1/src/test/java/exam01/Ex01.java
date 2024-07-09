package exam01;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

public class Ex01 {
    @Test
    void test() {
        Object obj = Proxy.newProxyInstance(Calculator.class.getClassLoader(),
                new Class[] {Calculator.class},
                new CalculatorHandler(new RecCalculator()));

        Calculator cal = (Calculator) obj;
        long res = cal.factorial(10L);
        System.out.println(res);
    }
}
