package exam03;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({TYPE, METHOD, FIELD})  //배열형식으로 여러가지 범위로 지정가능
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    int min() default 10; // nin 설정항목, 기본값 10
    int max() default 100; // max 설정항목, 기본값 100
    String[] names() default {"이름1"};

}
