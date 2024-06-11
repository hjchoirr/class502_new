package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule(2024,3,20);
        System.out.println(s1);  //s1.toString() -> 멤버변수 값을 확인하는 용도로 재정의
        System.out.println(s1.toString());  //윗줄과 동일함

        System.out.println(System.identityHashCode(s1));
    }
}
