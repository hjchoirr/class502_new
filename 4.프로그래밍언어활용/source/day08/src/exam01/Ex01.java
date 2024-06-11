package exam01;

import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println(Math.random());

        Random rand = new Random();
        for(int i = 0 ; i < 6; i++) {

            int num = rand.nextInt();
            System.out.println(num);

            boolean b = rand.nextBoolean();
            System.out.println(b);
        }
    }

}
