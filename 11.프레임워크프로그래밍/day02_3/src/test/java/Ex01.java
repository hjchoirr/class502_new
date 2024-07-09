import org.exam01.*;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

public class Ex01 {
    @Test
    void test() {
        Calculator calA = new ProxyCalculator(new ACalculator());
        Calculator calB = new ProxyCalculator(new BCalculator());
        int resultA = calA.add(10, 20);
        int resultB = calB.add(10, 20);

        System.out.println(resultA);
        System.out.println(resultB);
    }

    @Test
    void test2() {
        Object object = Proxy.newProxyInstance(Calculator.class.getClassLoader(),
                new Class[] {Calculator.class},
                new CalculatorHandler(new ACalculator()));
        Calculator calA = (Calculator) object;


        object = Proxy.newProxyInstance(Calculator.class.getClassLoader(),
                new Class[] {Calculator.class},
                new CalculatorHandler(new BCalculator()));

        Calculator calB = (Calculator) object;

        int resultA = calA.add(10, 20);
        int resultB = calB.add(10, 20);

    }
}
