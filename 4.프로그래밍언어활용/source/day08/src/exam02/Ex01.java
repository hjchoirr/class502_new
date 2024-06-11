package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01 {
    public static void main(String[] args) {
        String str = "I like java and javascript";

        Pattern p1 = Pattern.compile("java");
        Matcher m1 = p1.matcher(str);

        boolean result = m1.find();   //첫번째 있는 "jqvq" 찾기
        System.out.println(result);
        System.out.println(m1.group());

        result = m1.find();     //2번째 있는 "jqvq" 찾기
        System.out.println(result);
        System.out.println(m1.group());

        result = m1.find();     //2번째 있는 "jqvq" 찾기
        System.out.println(result);
        //System.out.println(m1.group());  // 없어서 에러

    }
}
