package exam01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 7, 9, 11, 13, 14};
        /*
        boolean result = true;
        for(int num : nums) {
            if (num % 2 == 0) {
                result = false;
                break;
            }
        }
        */
        boolean isOdd = Arrays.stream(nums).allMatch(x -> x % 2 == 1);
        System.out.println(isOdd);

        boolean isEven = Arrays.stream(nums).anyMatch(x -> x % 2 == 0);
        System.out.println(isEven);

        boolean notIncludedEvent = Arrays.stream(nums).noneMatch(x -> x % 2 == 0);
        System.out.println(notIncludedEvent);
    }
}
