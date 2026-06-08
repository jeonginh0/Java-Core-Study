package intermediate1.section.class5.enumeration.ex1;

public class DiscountService {

    //StringGrade를 사용하세요.
    public int discount(String grade, int price) {
        int discountPercent = 0;

        if (grade.equals(StringGrade.BASIC)) {
            discountPercent = 10;
        } else if (grade.equals(StringGrade.GOLD)) {
            discountPercent = 20;
        } else if (grade.equals(StringGrade.DIAMOND)) { //컴파일 시 오류 발생!!
            discountPercent = 30;
        } else {
            System.out.println(grade + ": 할인 X");
        }

        //10000 * (20 / 100) = 2000원
        return price * discountPercent / 100;
    }

}
