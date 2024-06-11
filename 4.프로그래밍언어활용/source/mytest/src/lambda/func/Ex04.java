package lambda.func;

public class Ex04 {

    public static void main(String[] args) {
        //Runnable : void run();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running!!");
            }
        };
        r1.run();

        Runnable r = () -> System.out.println("Running!!");
        r.run();
    }

}
