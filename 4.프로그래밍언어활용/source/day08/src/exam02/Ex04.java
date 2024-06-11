package exam02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("문장 입력하세요 :");
        String str = sc.nextLine();

        //Pattern p1 = Pattern.compile("[a-zA-Z]"); // a ~ z, A ~ Z까지 문자 하나하나,
        Pattern p1 = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
        Matcher m1 = p1.matcher(str);

        if(!m1.find()) {
            System.out.println("알파벳 안 포함됨!");
        }
    }
}
