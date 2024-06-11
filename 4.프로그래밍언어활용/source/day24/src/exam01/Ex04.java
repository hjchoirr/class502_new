package exam01;
public class Ex04 {
    public static void main(String[] args) {
        Runnable r = () -> {
          for(int i = 0; i < 300; i++) {
              System.out.print("-");
              for(long j = 0 ; j < 100000000L; j++) ;
          }
        };

        Runnable r2 = () -> {
          for(int i = 0; i < 300; i++) {
              System.out.print("+");
              for(long j = 0 ; j < 100000000L; j++) ;
          }
        };

        Thread th1 = new Thread(r);
        Thread th2 = new Thread(r2);

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {}

        System.out.println("작업종료!"); //메인 쓰레드
    }
}
