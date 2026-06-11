package intermediate1.section.class6.time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now(); // 오늘 날짜
        LocalDate ofDate = LocalDate.of(2013, 11, 21); // 지정 날짜
        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        //계산(불변)
        ofDate = ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10 = " + ofDate);
    }

}
