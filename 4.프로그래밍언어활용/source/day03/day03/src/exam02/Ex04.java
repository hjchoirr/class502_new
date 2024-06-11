package exam02;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);

        System.out.println("Pi: " + Math.PI);
        System.out.println("max: " + Math.max(1,3));

        int[] a = new int[] {100,20,35,14,25};

        Arrays.sort(a);
        for( int i: a) {
            System.out.println(i);
        }
    }
}
