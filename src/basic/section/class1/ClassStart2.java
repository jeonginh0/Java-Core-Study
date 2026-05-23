package basic.section.class1;

public class ClassStart2 {

    public static void main(String[] args) {
        /**
         * 배열로 ClassStart1의 코드를 리팩터링
         * 하지만 지금처럼 이름, 나이, 성적을 따로 나누어서 관리하는 것은 사람이 관리하기 좋은 방식이 아니다.
         * '학생'이라는 개념을 하나로 묶으면 관리하기 편해진다.
         * 각각의 학생 별로 본인의 이름, 나이, 성적을 관리하는 것이다.
          */
        String[] studentNames = {"학생1", "학생2", "학생3"};
        int[] studentAges = {15, 16, 17};
        int[] studentGrades = {90, 80, 60};

        for (int i = 0; i < studentNames.length; i++){
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 성적:" + studentGrades[i]);
        }


    }

}
