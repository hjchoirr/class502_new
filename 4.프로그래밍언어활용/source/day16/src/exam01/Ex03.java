package exam01;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        int[] scores = { 67, 80, 100, 98, 76, 56 };

        System.out.println(Arrays.stream(scores).sum());

        //int tot = Arrays.stream(scores).reduce(0, (n1, n2) -> n1 + n2);
        int tot = Arrays.stream(scores).reduce(0, (n1, n2) -> {
            System.out.printf("n1=%d n2=%d%n", n1, n2 );
            n1 += n2;
            return n1;
        });
        System.out.println(tot);

    }
}
