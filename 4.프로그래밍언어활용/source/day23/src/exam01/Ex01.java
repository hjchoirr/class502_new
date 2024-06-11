package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Runnable r = () -> {
          for(int i = 0 ; i < 5; i++) {
              System.out.println("쓰레드2-" + i);
              for(long j = 0; j < 10000000000L; j++ ) ;
          }
        };

        Ex01_1 th1 = new Ex01_1();
        Thread th2 = new Thread(r);

        th1.start(); // 호출스택 생성 + run() 실행
        th2.start(); // 호출스택 생성 + run() 실행
    }
}
class Ex01_1 extends Thread {
    public Ex01_1() {
        super("상속쓰레드"); // 쓰레드 이름 지정
    }
    public void run() {

        for(int i = 0 ; i < 5; i++) {
            //System.out.println("쓰레드1-" + i);
            System.out.println(getName() + "-" + i);
            for(long j = 0; j < 10000000000L; j++ ) ;
        }
        System.out.println("작업종료!");
    }
}
