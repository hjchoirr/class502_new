package lambda.func;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Ex05 {
    public static void main(String[] args) {
        int result1 = Calculator.staticSum(10,20);

        IntBinaryOperator cal2 = Calculator::staticSum;
        int result2 = cal2.applyAsInt(10,20);

        System.out.println("result1 : " + result1 + " result2 : " + result2);

        Calculator c3 = new Calculator();
        IntBinaryOperator cal3 = c3::instanceSum;

        int result3 = cal3.applyAsInt(10,20);
        System.out.println(result3);

    }
}
