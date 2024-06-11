package exam02;

import java.awt.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자만 입력 : ");
        String str = sc.nextLine();

        //Pattern p1 = Pattern.compile("[0-9]"); // 숫자포함
        //Pattern p1 = Pattern.compile("\\d"); // 숫자포함
        //Pattern p1 = Pattern.compile("[^0-9]"); // 숫자 아닌 문자 포함 ?
        Pattern p1 = Pattern.compile("\\D"); // 숫자 아닌 문자 포함 ?

        Matcher m1 = p1.matcher(str);

        if(m1.find()) {
            System.out.println("숫자만 입력하라구요");
        }

    }
}
