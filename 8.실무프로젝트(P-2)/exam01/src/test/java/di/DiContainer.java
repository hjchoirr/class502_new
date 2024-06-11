package di;

public class DiContainer {
    public void store2() {
        Product pencil = new Pencil2();

        Store2 store = new Store2(pencil);
    }
}
