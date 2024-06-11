package exam01;

public class Ex01 {
    public static void main(String[] args) {
        SimpleCalculator cal = new SimpleCalculator() ;
        int ret = cal.add(20, 30);
        System.out.println("cal.add : " + ret);
        System.out.println(cal.num);
    }
}
