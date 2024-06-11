package home04;

public class ExConnection {
    public static void main(String[] args) {
        Connection conn1 = Connection.get();
        conn1.count();
        Connection conn2 = Connection.get();
        conn2.count();
        Connection conn3 = Connection.get();
        conn3.count();

        System.out.println(conn1.getCount());

        Connection2 conn11 = new Connection2();
        conn11.countC();
        Connection2 conn12 = new Connection2();
        conn11.countC();
        Connection2 conn13 = new Connection2();
        conn11.countC();

        System.out.println(conn11.getCountC());
    }

}
