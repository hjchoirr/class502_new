package exam04;

import java.util.HashSet;

public class Ex03 {
    public static void main(String[] args) {
        //set : 중복 X
        HashSet<Integer> lotto = new HashSet<>();
        while(lotto.size() < 6) {
            lotto.add(getNumber());
        }
        System.out.println(lotto);
    }
    public static int getNumber() {
        return (int)(Math.random() * 43) + 1;
    }
}
