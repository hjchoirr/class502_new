package exam05;

public class Ex01 {
    public static void main(String[] args) {
        SimpleCalculate cal = new SimpleCalculate();
        int result= cal.add(10,20);
        System.out.println(result);
        System.out.println(cal.num);
    }
}
