package exam03;

public class Student {
    public int id = 10;
    public String name = "hjchoi";

    @Override
    public String toString() {
        return "id : " + id + " name : " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student std) {
            return std.id == id;
        }
        return false;
    }
}
