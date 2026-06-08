package intermediate1.section.class5.enumeration.ex2;

public class DiscountService {

    //StringGrade를 사용하세요.
    public int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

        if (classGrade == ClassGrade.BASIC) {
            discountPercent = 10;
        } else if (classGrade == ClassGrade.GOLD) {
            discountPercent = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인 X");
        }

        //10000 * (20 / 100) = 2000원
        return price * discountPercent / 100;
    }

}
