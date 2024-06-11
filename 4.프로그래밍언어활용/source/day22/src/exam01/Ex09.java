package exam01;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex09 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("book.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)) {

            Book book1 = (Book)ois.readObject();
            System.out.println(book1.toString());

            Book book2 = (Book)ois.readObject();
            System.out.println(book2.toString());

            String str = (String)ois.readObject();
            System.out.println(str);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
