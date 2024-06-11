package exam02;

public class Ex03 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 2;

            String str = null;
            System.out.println(str.toUpperCase()); //NullPointer Exception

        } catch (Exception e) { // catch (ArithmeticException | NullPointerException e)
            e.printStackTrace();
        }
        System.out.println("매우 중요한 코드..");
    }
}
