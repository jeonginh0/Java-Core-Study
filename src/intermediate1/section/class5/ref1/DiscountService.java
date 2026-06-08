package intermediate1.section.class5.ref1;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        //10000 * (20 / 100) = 2000원
        //Inline Variable
        return price * classGrade.getDiscountPercent() / 100;
    }

}
