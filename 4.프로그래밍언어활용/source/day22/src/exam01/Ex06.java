package exam01;
import java.io.File;
import java.io.IOException;

public class Ex06 {
    public static void main(String[] args) throws IOException, InterruptedException {
        File  tmpfile = File.createTempFile("tmp", ".log", new File("D:/fstudy"));
        //tmpfile.delete();
        tmpfile.deleteOnExit();
        Thread.sleep(5000);
    }
}
