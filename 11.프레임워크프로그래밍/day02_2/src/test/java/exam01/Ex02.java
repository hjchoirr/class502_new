package exam01;

import exam02.CalculatorHandler;
import exam02.ImplCalculator;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;
import exam02.Calculator;

public class Ex02 {
    @Test
    void test1() {
        Object obj = Proxy.newProxyInstance(
                Calculator.class.getClassLoader(),
                new Class[] {Calculator.class},
                new CalculatorHandler(new ImplCalculator()));

        Calculator cal = (Calculator) obj;
        long result = cal.factorial(10L);
        System.out.println(result);
        System.out.println(cal);
    }
}
