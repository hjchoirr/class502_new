package exam01;
public class Ex09 {
    public static void main(String[] args) throws InterruptedException{
        Ex09_1 th1 = new Ex09_1("*");
        Ex09_1 th2 = new Ex09_1("**");
        Ex09_1 th3 = new Ex09_1("***");

        th1.start();
        th2.start();
        th3.start();

        Thread.sleep(2000);
        th1.suspend();
        Thread.sleep(2000);
        th2.suspend();

        Thread.sleep(3000);
        th1.stop();
        th2.stop();

        Thread.sleep(2000);
        th3.stop();
    }
}
class Ex09_1 implements Runnable {
    private volatile boolean stopped; // 정지 X
    private volatile boolean suspended = false; //일시정지 X

    private Thread th;

    public Ex09_1(String name) {
        th = new Thread(this, name);
    }

    @Override
    public void run() {
        while(!stopped) {
            if(!suspended) {
                System.out.println(th.getName());
                try {
                    Thread.sleep(1000);
                } catch ( InterruptedException e) {
                    System.out.println("Interrupted!");
                }
            } else {
                th.yield(); //일시정지 상태일때 양보
            }
        }
    }
    public void start() {
        th.start();
    }
    public void suspend() {
        suspended = true;
        System.out.println("suspended - interrupted!");
        th.interrupt();
    }
    public void resume() {
        suspended = false;
    }
    public void stop() {
        stopped = true;
        //System.out.println("stop - interrupted!");

    }

}
