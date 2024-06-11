package exam01;

import java.util.Arrays;
import java.util.Comparator;

public class Ex07 {
    public static void main(String[] args) {
        int[] nums = { 22,10, 5, 1, 99, 50};

        Arrays.sort(nums); // 기본정렬, Integer 기본정렬 기준 - java.lang.Comparable, int compareTo(..)
        System.out.println(Arrays.toString(nums));

        Integer[] nums2 = { 22,10, 5, 1, 99, 50};
        Arrays.sort(nums2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(nums2));
    }
}
