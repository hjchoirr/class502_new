package home01;

import java.awt.geom.RoundRectangle2D;

public class ExDirection2 {
    public static void main(String[] args) {
        Direction[] dArr = Direction.values();
        for(Direction d : dArr) {
            System.out.printf("d : %s, d.ordinal(): %d, d.name(): %s%n", d, d.ordinal(), d.name());
        }
        Direction d1 = Direction.valueOf("SOUTH");
        System.out.println(d1.name());

        Direction d2 = Direction.SOUTH;
        System.out.println(d2.name());

        Direction d3 = Direction.EAST;
        System.out.printf("d2.compareTo(d3): %d %d%n", d2.compareTo(d3), d2.ordinal() - d3.ordinal());
        System.out.printf("d3.compareTo(d2): %d %d%n", d3.compareTo(d2), d3.ordinal() - d2.ordinal());

        Direction d4 = Enum.valueOf(Direction.class, "SOUTH");
        System.out.println(d4.name());

    }
}
