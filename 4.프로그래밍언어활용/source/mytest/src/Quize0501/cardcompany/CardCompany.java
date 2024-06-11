package Quize0501.cardcompany;

public class CardCompany {
    private static CardCompany instance;

    private CardCompany() {
        System.out.println("카드회사 인스턴스 생성!");
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
