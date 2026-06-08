package intermediate1.section.class5.enumeration.ex3;

public class DiscountService {

    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        if (grade == Grade.BASIC) {
            discountPercent = 10;
        } else if (grade == Grade.GOLD) {
            discountPercent = 20;
        } else if (grade == Grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인 X");
        }

        //10000 * (20 / 100) = 2000원
        return price * discountPercent / 100;
    }

}
