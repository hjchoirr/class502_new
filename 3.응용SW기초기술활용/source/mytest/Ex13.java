package exam01;

public class Ex13 {
    public static void main(String[] args) {
        int floor = 2;
        switch(floor) {
            case 1:
                System.out.println("1층 약국입니다");
                break;
            case 2:
                System.out.println("2층 정형외과입니다");
                break;
            case 3:
                System.out.println("3층 피부과입니다");
                break;
            case 4:
                System.out.println("4층 치과입니다");
                break;
            case 5:
                System.out.println("5층 헬스클럽입니다");
                break;
            default:
                System.out.println("없는 층");

        }

    }
}
