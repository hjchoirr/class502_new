package org.exam01;

public class ProxyCalculator implements Calculator {

    Calculator calculator;

    public ProxyCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int a, int b) {
        System.out.println("공통부분1");

        try {
            return calculator.add(a, b);
        } finally {
            System.out.println("공통부분2");
        }

    }
}
