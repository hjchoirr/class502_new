package exam02;

public class Student {
    public static int id;
    private String name = "이이름";
    private String subject;

    public Student(int id, String name, String subject) {
        Student.id = id;
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
    public Student() {}

    public static void staticMethod() {
        System.out.println("정적매서드");

    }
    public void instanceMethod() {
        System.out.println("인스턴스매서드.." + this.name);
    }
}
