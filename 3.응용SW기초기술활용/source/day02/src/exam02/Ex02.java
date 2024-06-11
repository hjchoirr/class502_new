package exam02;

public class Ex02 {
    public static void main(String[] args) {
        int[] nums = new int[4]; // int형 변수 4개, 순차 자료구조
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums.length);
        for(int i = 0 ; i < nums.length; i++) {
            System.out.println(i + "번째 nums : " + nums[i]);
        }
    }
}
