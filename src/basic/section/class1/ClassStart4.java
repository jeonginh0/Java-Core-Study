package basic.section.class1;

public class ClassStart4 {

    public static void main(String[] args) {
        /**
         * 배열을 사용하면 특정 타입을 연속한 데이터 구조로 묶어서 편리하게 관리할 수 있음.
         * Student 타입을 이용해서 배열을 생성하고 관리하기
         * Student 타입의 변수는 Student 객체(인스턴스)의 참조값을 보관한다.
         * 배열또한 마찬가지.
         * 배열에는 아직 참조값을 대입하지 않아서 참조값이 없다는 의미의 null 값으로 초기화 된다.
         */
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름:" + students[0].name + " 나이:" +  students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:" +  students[1].age + " 성적:" + students[1].grade);

        // 참조값 출력 @뒤가 참조값 basic.section2.class1.Student@452b3a41
        System.out.println(student1);
        System.out.println(student2);
    }

}
