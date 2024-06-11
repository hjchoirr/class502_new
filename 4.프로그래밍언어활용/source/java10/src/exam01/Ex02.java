package exam01;

public class Ex02 {
    public static void main(String[] args) {
        Transportation trans = Transportation.BUS;
        Enum<Transportation> trans2 = trans;  // 다형성 사용

        switch(trans) {
            case BUS: // Transfortation.BUS 라고 쓰지 않는다
                System.out.println("버스");
                break;
            case SUBWAY:
                System.out.println("지하철");
                break;
            case TAXI:
                System.out.println("택시");
                break;
        }
    }
}
