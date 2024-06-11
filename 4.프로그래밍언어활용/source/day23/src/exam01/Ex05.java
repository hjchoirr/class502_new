package exam01;
import javax.swing.*;

public class Ex05 {
    public static void main(String[] args) throws InterruptedException {

        Thread th = new Thread(() -> {
            String message = JOptionPane.showInputDialog("메세지입력");
            System.out.println(message);
        });
        th.start();

        for(int i = 0;i <= 10; i++ ){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
