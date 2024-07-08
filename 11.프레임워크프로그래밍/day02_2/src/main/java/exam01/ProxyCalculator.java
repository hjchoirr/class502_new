package exam01;

public class ProxyCalculator implements Calculator{

    private Calculator calculator;

    public ProxyCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public long factorial(long num) {
        long stime = System.nanoTime();

        try {
            long result = calculator.factorial(num); //다른 계산기의 factorial 연산을 대신 수행
            return result;
        } finally {
            long etime = System.nanoTime();
            System.out.println("걸린시간 : " + (etime - stime));
        }
    }
}
