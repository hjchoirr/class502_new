package exam02;

public class Ex02 {
    public static void main(String[] args) {
        /*
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
        */
        int c = 10;
        Calculator cal2 = (a, b) -> {
            //c = 20; // 에러 : c 는 상수화되었으므로
            return a + b + c;
        };

        int result = cal2.add(10,20);
        System.out.println(result);
    }
}
