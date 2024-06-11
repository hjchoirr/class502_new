package hakwon01.q5;

public class CardCompany {
    private static CardCompany instance;

    private CardCompany() {
        System.out.println("CardCompany 클래스를 생성하였습니다.");
    }
    public static CardCompany getInstance() {
        if(instance == null) {
            instance = new CardCompany();
        }
        return instance;
    }
    public Card createCard() {
      return new Card();
    }
}
