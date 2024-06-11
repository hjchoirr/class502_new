package exam02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");
            System.out.println("파일작업...");

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if(fis != null) {
                try {
                    fis.close();    //IOException
                } catch ( IOException e) {

                }
            }

        }
    }
}
