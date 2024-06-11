package home01;

public enum Direction2 {
    EAST(1, "<"),
    WEST(2, ">"),
    SOUTH(3, "v"),
    NORTH(4,"^");

    private final int val;
    private final String symbol;

    Direction2(int i, String s) {
        this.val = i;
        this.symbol = s;
    }

    public int getVal() {
        return val;
    }

    public String getSymbol() {
        return symbol;
    }
}
