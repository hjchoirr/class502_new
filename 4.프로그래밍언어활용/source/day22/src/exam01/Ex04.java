package exam01;
import java.io.File;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) throws IOException {
        //File file = new File("D:/test1.text");
        //file.createNewFile();
        File dir = new File("D:/fstudy");
        if(!dir.exists()) {
            dir.mkdir();
        }
        File file = new File(dir, "text1.txt");
        file.createNewFile();
    }
}
