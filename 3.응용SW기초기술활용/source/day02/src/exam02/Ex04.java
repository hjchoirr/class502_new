package exam02;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        String[] str = {"가나", "다라", "마바"};
        for(int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

        for(String s: str) {
            System.out.println(s); //향상된 for문
        }
        //Arrays.stream(str).forEach(System.out::println);
    }
}
