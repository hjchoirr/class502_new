package exam01;

import java.util.StringTokenizer;

public class Ex04 {
    public static void main(String[] args) {
        String fruits = "Apple#Orange#Melon#Banana#Mango";
        String fruits2 = "Apple,Orange#Melon_Banana#Mango";
        StringTokenizer st = new StringTokenizer(fruits, "#");

        while(st.hasMoreTokens()) {
            String fruit = st.nextToken();
            System.out.println(fruit);
        }
        System.out.println("--------------");
        StringTokenizer st2 = new StringTokenizer(fruits2, "#_+,");
        while(st2.hasMoreTokens()) {
            String fruit = st2.nextToken();
            System.out.println(fruit);
        }
    }
}
