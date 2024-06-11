package exam01;

public class Ex01 {
    public static void main(String[] args) {

        // %d : 정수 , %f : 실수 , %s : 문자열, %c : 문자

        System.out.printf("[%s]", "ab"); // [ab]
        System.out.printf("[%5s]", "ab");  // [   ab]
        System.out.printf("[%-5s]", "ab"); // [ab   ]
        System.out.println();

        System.out.printf("[%5d]", 100);  // [  100]
        System.out.printf("[%05d]", 100); // [00100]
        System.out.println();

        double num = 0.12345678;
        System.out.printf("[%f]", num);    // [0.123457]
        System.out.printf("[%.2f]", num);  // [0.12]
        System.out.printf("[%7.2f]", num); // [   0.12]  %전체자리수.소수점자리수
        System.out.println();

        double num2 = 12.0;
        System.out.printf("[%f]", num2);    // [12.000000]
        System.out.printf("[%.2f]", num2);  // [12.00]
        System.out.printf("[%7.2f]", num2); // [  12.00]

    }
}
