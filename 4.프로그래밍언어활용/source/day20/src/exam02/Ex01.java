package exam02;

public class Ex01 {
    public static void main(String[] args) {
        ImplCalculator cal1 = new ImplCalculator();
        long stime = System.nanoTime();
        long result1 = cal1.factorial(1000L);   //핵심기능
        long etime = System.nanoTime();
        System.out.printf("cal1:%d%n", result1);
        System.out.printf("걸린시간: %d%n",etime - stime);

        RecCalculator cal2 = new RecCalculator();
        stime = System.nanoTime();
        long result2 = cal2.factorial(1000L);  //핵심기능
        etime = System.nanoTime();
        System.out.printf("cal2:%d%n", result2);
        System.out.printf("걸린시간: %d%n",etime - stime);
    }
}
