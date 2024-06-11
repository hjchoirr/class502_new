package exam13;

public class Ex03 {
    public static void main(String[] args) {
        calc(new Calculator() {

            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        });
        calc((a,b) -> a + b);
    }
    public static void calc(Calculator cal) {
        int result = cal.add(10,20);
        System.out.println(result);
    }
}
