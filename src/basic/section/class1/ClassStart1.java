package basic.section.class1;

public class ClassStart1 {

    public static void main(String[] args) {
        /**
         * 아래 코드처럼 코드를 작성하면 학생이 늘어날 때 마다 변수를 추가로 선언해야 하며,
         * 출력하는 코드도 추가해야 한다.
          */
        String student1Name = "학생1";
        int studnet1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int studnet2Age = 16;
        int student2Grade = 80;

        String student3Name = "학생3";
        int studnet3Age = 17;
        int student3Grade = 60;

        System.out.println("이름:" + student1Name + " 나이:" + studnet1Age + " 성적:" + student1Grade);
        System.out.println("이름:" + student2Name + " 나이:" + studnet2Age + " 성적:" + student2Grade);
        System.out.println("이름:" + student3Name + " 나이:" + studnet3Age + " 성적:" + student3Grade);
    }

}
