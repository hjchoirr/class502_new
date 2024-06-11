package exam01;

public class Ex08 {
    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread(()-> {
           Thread th2 = Thread.currentThread();
           while(true) {
               try {
                   System.out.println("isInterruped1: " + th2.isInterrupted());
                   Thread.sleep(10000); // Waiting - 일시정지
               }catch(InterruptedException e) { // RUNNABLE - 실행대기
                   System.out.println("isInterruped2 : " + th2.isInterrupted());
                   System.out.println("InterruptedException 발생!");
                   //th2.interrupt();
               }
           }
        });

        th.start();

        Thread.sleep(3000);
        th.interrupt(); // InterruptedException 발생, isInterruped -> true
    }
}
