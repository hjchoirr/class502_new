package hakwon01.q4;

public class ExCardCompany {
    public static void main(String[] args) {
        CardCompany company = new CardCompany();

        Card card = company.createCard();
        System.out.println(card.getCardNo());

        Card card2 = company.createCard();
        System.out.println(card2.getCardNo());

    }
}
