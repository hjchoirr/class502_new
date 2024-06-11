package home02;

import java.lang.annotation.Annotation;
import java.util.Arrays;

@TestInfo(testedBy = "hjchoi", testDate = @DateTime(yymmdd="240430", hhmmss="120000"))
public class ExAnnotation {
    public static void main(String[] args) {
        Class<ExAnnotation> cls = ExAnnotation.class;
        TestInfo anno = cls.getAnnotation(TestInfo.class);
        System.out.println("anno.testedBy() : " + anno.testedBy());
        System.out.println("anno.Count() : " + anno.Count());
        System.out.println("anno.testType() : " + anno.testType());
        System.out.println("anno.testTools() : " + Arrays.toString(anno.testTools()));
        System.out.println("anno.testDate().yymmdd() : " + anno.testDate().yymmdd());

        Annotation[] anno1 = cls.getAnnotations();
        for(Annotation a : anno1) {
            System.out.println(a);
        }

    }
}
