package intermediate1.section.class5.ref2;

public class DiscountService {

    public int discount(Grade grade, int price) {
        //10000 * (20 / 100) = 2000원
        //Inline Variable
        return price * grade.getDiscountPercent() / 100;
    }
}
