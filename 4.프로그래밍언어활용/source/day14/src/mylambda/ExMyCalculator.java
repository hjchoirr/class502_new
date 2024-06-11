package mylambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class ExMyCalculator {
    public static void main(String[] args) {
        //MyCalculator calcu = (x,y) -> x + y;
        //int result = calcu.plus(10,20);
        //System.out.println(result);

        MyCalculator calc = (x, y) -> x + y;
        calcuPlus(calc);

    }
    public static void calcuPlus(MyCalculator calcu) {
        int result = calcu.plus(10,20);
        System.out.println(result);
    }
}
