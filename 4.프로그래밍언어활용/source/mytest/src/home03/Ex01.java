package home03;

import java.lang.annotation.Annotation;

@Deprecated
@TestInfo(testedBy="hjchoi", testDate=@DateTime(yymmdd="240430", hhmmss="171500"))
public class Ex01 {
    public static void main(String[] args) {
// Ex01 Class 객체를 얻는다.
        Class<Ex01> cls = Ex01.class;
        TestInfo anno = (TestInfo)cls.getAnnotation(TestInfo.class);
        System.out.println("anno.testedBy() : " + anno.testedBy());
        System.out.println("anno.testType() : " + anno.testType());
        System.out.println("anno.testDate().yymmdd() : " + anno.testDate().yymmdd());
        System.out.println("anno.testDate().hhmmss() : " + anno.testDate().hhmmss());

        for(String str : anno.testTools()) {
            System.out.println("testTools : " + str);
        }
        System.out.println("-----");
        // Ex01 적용된 모든 애너테이션을 가져온다.
        Annotation[] annoArr = cls.getAnnotations();
        for (Annotation a : annoArr) {
            System.out.println(a);
        }
    }
}
