package exam01;

public class Student {

    int id;
    String name;
        String subject;

        void study() {
            System.out.printf("학번:%d, %s가 %s 공부한다", id, name, subject);
        }

        public Student() {
                // 객체가 생성된 이후 실행코드 정의, id, name, subject 에 공간 할당 받은 상태
            id = 1000;
            name = "이이름";
            subject = "자바";
        }

        public Student(int _id, String _name, String _subject) {
            id = _id;
            name = _name;
            subject = _subject;
    }
}
