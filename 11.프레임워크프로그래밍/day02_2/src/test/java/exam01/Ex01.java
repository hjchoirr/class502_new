package exam01;

import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;

public class Ex01 {
    @Test
    void test1() {
        long stime = System.nanoTime();   //공통기능
        RecCalculator cal2 = new RecCalculator();
        long result2 = cal2.factorial(10L);  //핵심기능
        long etime = System.nanoTime();
        System.out.println("cal2=" + result2 + " 걸린시간:" + (etime - stime));

        stime = System.nanoTime(); //공통기능
        ImplCalculator cal1 = new ImplCalculator();
        long result1 = cal1.factorial(10L);  //핵심기능
        etime = System.nanoTime();
        System.out.println("cal1=" + result1 + " 걸린시간:" + (etime - stime));

    }


    @Test
    void test2() {
        Calculator cal1 = new ProxyCalculator(new ImplCalculator());
        long result1 = cal1.factorial(10L);
        System.out.println("cal1:" + result1);

        Calculator cal2 = new ProxyCalculator(new RecCalculator());
        long result2 = cal2.factorial(10L);
        System.out.println("cal2:" + result2);

    }
}
