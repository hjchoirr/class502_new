package exam02;

import java.util.Arrays;

public class Q5Lee {
    public static void main(String[] args) {
        int[] nums = { 21, 22, 30, 11, 99, 31 };

        for(int i = 0 ; i < nums.length / 2; i ++) {
            int temp = nums[i];
            int index = nums.length - i - 1;
            nums[i] = nums[index];
            nums[index] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
