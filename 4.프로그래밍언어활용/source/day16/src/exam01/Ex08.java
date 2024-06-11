package exam01;

import javax.management.remote.rmi.RMIServerImpl_Stub;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Ex08 {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "이이름", 80),
                new Student(1, "김이름", 100),
                new Student(1, "박이름", 40),

                new Student(2, "이이름", 80),
                new Student(2, "김이름", 50),
                new Student(2, "박이름", 70),

                new Student(3, "이이름", 80),
                new Student(3, "김이름", 100),
                new Student(3, "박이름", 90)
        };
        /*
        Map<Integer, List<Student>> data = Arrays.stream(students).collect(Collectors.groupingBy(s -> s.getBan()));
        List<Student> students2 = data.get(2);
        students2.forEach(System.out::println);
        */
        Map<Boolean, List<Student>> data = Arrays.stream(students).collect(Collectors.partitioningBy(s -> s.getScore() >= 80));
        List<Student> students1 = data.get(true);
        students1.forEach(System.out::println);
    }
}
