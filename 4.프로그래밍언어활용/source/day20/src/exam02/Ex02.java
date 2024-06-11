package exam02;

public class Ex02 {
    public static void main(String[] args) {
        Calculator cal1 = new DecorateCalculator(new ImplCalculator());
        long result1 = cal1.factorial(1000L);
        System.out.println(result1);

        Calculator cal2 = new DecorateCalculator(new RecCalculator());
        long result2 = cal2.factorial(1000L);
        System.out.println(result2);

    }
}
