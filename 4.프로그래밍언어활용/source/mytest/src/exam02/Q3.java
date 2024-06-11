package exam02;

public class Q3 {
    public static void main(String[] args) {
        int fl = 4;

        switch(fl) {
            case 1:
                System.out.println(fl + "층 약국" );
                break;
            case 2:
                System.out.println(fl + "층 정형외과");
                break;
            case 3:
                System.out.println(fl + "층 피부과");
                break;
            case 4:
                System.out.println(fl + "층 치과");
                break;
            case 5:
                System.out.println(fl + "층 헬스클럽");
                break;
            default:
                System.out.println("없는 층");

        }
    }
}
