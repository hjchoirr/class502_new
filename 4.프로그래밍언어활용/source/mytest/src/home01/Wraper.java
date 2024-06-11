package home01;

public class Wraper {
    public static void main(String[] args) {

        int num0 = 10;
        Integer iNum = new Integer(100);
        int num = iNum.intValue();

        Integer iNum2 = new Integer("200");
        int num2 = iNum2.intValue();

        System.out.printf("num=%d num2=%d%n", num, num2);

        Integer iNum3 = Integer.parseInt("300"); //  300은 에러
        Integer iNum4 = Integer.valueOf("400");
        Integer iNum5 = Integer.valueOf(500);
        Integer iNum6 = new Integer(600);

        System.out.printf("iNum3=%d iNum4=%d iNum5=%d iNum6=%d%n", iNum3, iNum4, iNum5, iNum6);

    }
}
