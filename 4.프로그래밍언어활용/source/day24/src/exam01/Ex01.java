package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Ex01_1 th = new Ex01_1();
        th.start();  // 새로운 호출 스택을 만들고 run() 호출함

        for(int i = 0; i <= 5 ; i++) {
            System.out.println("메인 쓰레드 - " + i);

        }
    }
}
// Thread 클래스 상속
class Ex01_1 extends Thread {
    public void run() {
        for( int i = 0 ; i <= 5 ; i++ ) {
            System.out.println("쓰레드 - " + i);
        }
    }
}