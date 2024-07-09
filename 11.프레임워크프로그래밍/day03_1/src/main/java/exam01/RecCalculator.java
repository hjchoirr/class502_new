package exam01;

public class RecCalculator implements Calculator{
    @Override
    public long factorial(long n) {
        if(n <= 1L) {
            return 1L;
        }
        return n * factorial(n - 1);
    }
}
