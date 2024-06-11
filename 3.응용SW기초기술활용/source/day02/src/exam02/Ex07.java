package exam02;
import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {
        int[][]nums = { {10,20,30,40}, {50,60,70,80}};
        /*
        for(int i = 0; i < nums.length; i ++) {
            for(int j = 0; j < nums[i].length; j++) {
                System.out.println(nums[i][j]);
            }
        }
        System.out.println(nums);
         */
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.deepToString(nums));
    }
}
