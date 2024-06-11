package home04;

public class Ex01 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Grepe> grapeBox = new Box<Grepe>();
        Box<Toy> toyBox = new Box<Toy>();

        fruitBox.add(new Fruit());
        //appleBox.add((Apple)new Fruit());

        grapeBox.add(new Grepe());
        //appleBox.add(new Toy());

        fruitBox.add(new Apple());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(grapeBox);
        System.out.println(toyBox);

    }
}
