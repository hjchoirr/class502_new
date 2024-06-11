package home01;

import java.util.Arrays;

public class ExDirection {
    public static void main(String[] args) {
        Direction dir1  = Direction.SOUTH;
        switch(dir1) {
            case EAST:
                System.out.println("동");
                System.out.println(dir1.name());
                System.out.println(dir1.ordinal());
                break;
            case WEST:
                System.out.println("서");
                System.out.println(dir1.name());
                System.out.println(dir1.ordinal());
                break;
            case SOUTH:
                System.out.println("남");
                break;
        }
        Direction[] dArr = Direction.values();
        for(Direction d : dArr) {
            System.out.printf("d : %s, d.ordinal(): %d, d.name(): %s%n", d, d.ordinal(), d.name());
        }
        Direction d2 = Direction.valueOf("SOUTH");
        System.out.println(d2.name());
    }
}
