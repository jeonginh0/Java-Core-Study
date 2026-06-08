package intermediate1.section.class5.enumeration.ex2;

public class ClassGradeEx2_1 {

    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        //ClassGrade에서 선언한 상수 클래스 변수 자체가 인스턴스를 생성하며 참조값을 그대로 넘김.
        //허나 해당 방법을 사용한다면 치명적인 단점이 존재함.
        //외부에서 할인정책에 등록되지 않은 인스턴스를 사용자가 따로 생성할 수 있다는 점.
        //이를 막으려면 외부에서 ClassGrade를 생성할 수 없게 private으로 생성자를 변경하면 됨.
        int basic = discountService.discount(ClassGrade.BASIC, price);
        int gold = discountService.discount(ClassGrade.GOLD, price);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);

    }

}
