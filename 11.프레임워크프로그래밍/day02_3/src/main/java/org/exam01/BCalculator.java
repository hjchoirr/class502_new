package org.exam01;

public class BCalculator implements Calculator{
    @Override
    public int add(int a, int b) {
        return a + b + b;
    }
}
