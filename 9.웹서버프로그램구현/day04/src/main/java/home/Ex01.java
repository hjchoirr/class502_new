package home;

public class Ex01 {
    public static void main(String[] args) throws InterruptedException {
        int num1 = 30;
        int num2 = 0;
        try {
            int result = num1 / num2;
        } catch (Exception e){
            //e.printStackTrace();
            //System.out.println(e.getMessage());
            e.printStackTrace(new java.io.PrintWriter(System.out));
        }
        Thread.sleep(10000);
        System.out.println("The end!!");
    }
}
