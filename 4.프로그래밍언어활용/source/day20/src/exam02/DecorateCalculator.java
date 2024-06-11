package exam02;

public class DecorateCalculator implements Calculator{

    private Calculator calculator;

    public DecorateCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public long factorial(long num) {
        long stime = System.nanoTime();
        try {
            long result = calculator.factorial(num);
            return result;
        } finally {
            long etime = System.nanoTime();
            System.out.printf("걸린시간:%d%n", etime - stime);
        }
    }
}
