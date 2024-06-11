package exam01;

public class Ex01 {
    public static void main(String[] args) {
        int num1;
        num1 = 10; //최초로 값을 대입하는 것 -> 초기화
        int num2 = 20;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println((num2 = num1));

        num1 = 15;
        System.out.println(num1 + " " + num2);

        num1 = 100;
        int numberOfStudents = 20;

    }
}
