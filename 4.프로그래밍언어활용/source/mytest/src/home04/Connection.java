package home04;

public class Connection {
    private static Connection _inst = null;
    private int count = 0;
    static public Connection get() {
        if(_inst == null) {
            System.out.println("new-connection!");
            _inst = new Connection();
            return _inst;
        }
        return _inst;
    }
    public void count() {
        count ++;
        System.out.println("count : " + count);
    }
    public int getCount() { return count; }

}
