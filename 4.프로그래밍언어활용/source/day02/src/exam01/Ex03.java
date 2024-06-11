package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Student s1 = new Student();
        //System.out.println(System.identityHashCode(s1));
        s1.study();

        Student s2 = new Student(1001, "김이름", "리액트" );
        s2.study();
    }
}
