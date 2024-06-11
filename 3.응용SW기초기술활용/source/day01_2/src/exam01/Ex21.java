package exam01;

public class Ex21 {
    public static void main(String[] args) {
        int[] nums = {20,30,15,99};
        int[] nums2 = new int[nums.length];

        for(int i = nums.length - 1 ; i >= 0; i--) {
            nums2[nums.length - 1 - i] = nums[i];  //역순의 새 배열 nums2
        }

        //nums2 내용확인
        for(int i = 0; i < nums2.length; i++){
            System.out.printf("nums2[%d] : %d%n", i, nums2[i]);
        }
    }
}
