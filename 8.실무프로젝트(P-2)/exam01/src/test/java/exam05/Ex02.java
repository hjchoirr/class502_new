package exam05;

public class Ex02 {
    public static void main(String[] args) {
        ComputerAssembler assem = new ComputerAssembler();

        Desktop d1 = assem.desktop();
        Desktop d2 = assem.desktop();

        Tablet t1 = assem.tablet();

        d1.run();
        t1.run();

    }
}
