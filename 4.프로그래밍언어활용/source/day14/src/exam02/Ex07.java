package exam02;

import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {
        int[] nums = { 22,11,53, 4,6, 43 };

        Arrays.stream(nums).map(x -> x * x).filter( x -> x % 2 == 0).forEach(System.out::println);
    }
}
