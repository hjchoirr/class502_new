package exam02;

public class Ex03 {
    public static void main(String[] args) {
        FruitBox<Toy> toyBox = new FruitBox<>();
        toyBox.add(new Toy());
        //Juicer.make(toyBox); //안되도록...
    }
}
