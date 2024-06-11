package hakwon01.q9;

public class MyDog {
    String name1;
    String name2;

    MyDog(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }
    @Override
    public String toString() {
        return name2 + " " + name1;
    }
}
