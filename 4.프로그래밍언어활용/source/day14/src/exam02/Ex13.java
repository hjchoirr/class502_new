package exam02;

import java.util.stream.IntStream;

public class Ex13 {
    public static void main(String[] args) {
        IntStream.range(1,10).forEach(i -> System.out.println("반복" + i));
        System.out.println(IntStream.rangeClosed(1,10).sum());
    }
}
