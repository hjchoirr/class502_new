package exam01;

import java.util.Optional;

public class Ex08 {
    public static void main(String[] args) {
        String str = "ABC";

        Optional<String> opt = Optional.of(str);
        System.out.println(opt.get());
        str = null;

        //opt = Optional.of(str); //NPE 발생
        opt = Optional.ofNullable(str);  //NPE 발생안함 null 허용

        //System.out.println(opt.get()); //NPE 발생
        String value = opt.orElse("기본값"); //null 허용된 opt => 꺼낼때 null 인지 체크하기
        System.out.println(value);
    }
}
