package exam01;

import java.util.Random;
import java.util.stream.DoubleStream;

public class Ex03 {
    public static void main(String[] args) {
        Random rand = new Random();
        //rand.ints().limit(6).forEach(System.out::println);
        rand.ints(6).forEach(System.out::println); // 위와 동일
    }
}
