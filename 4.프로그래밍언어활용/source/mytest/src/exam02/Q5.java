package exam02;

public class Q5 {
    public static void main(String[] args) {
        int[] nums = { 21, 22, 30, 11, 99, 31 };
        int[] nums2 = new int[nums.length];

        for(int i = nums.length - 1; i >= 0; i--) {
            nums2[nums.length - 1 - i] = nums[i];
        }

        //nums2 내용확인
        for(int i = 0; i < nums2.length; i++){
            System.out.printf("nums2[%d] : %d%n", i, nums2[i]);
        }

    }
}
