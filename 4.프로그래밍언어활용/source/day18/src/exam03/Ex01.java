package exam03;
import java.text.DecimalFormat;

public class Ex01 {
    public static void main(String[] args) {
        double num1 = 10000000000.123;
        double num2 = 0.123;

        DecimalFormat df = new DecimalFormat("0,000.0000");
        String num1Str = df.format(num1); // 10,000,000,000.1230
        System.out.println(num1Str);

        DecimalFormat df2 =  new DecimalFormat("#,###.####");
        String num1Str2 = df2.format(num1);  // 10,000,000,000.123
        String num1Str3 = df2.format(num2);  // 0.123
        System.out.println(num1Str2);
        System.out.println(num1Str3);
    }
}
