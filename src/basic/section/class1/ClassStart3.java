package basic.section.class1;

public class ClassStart3 {

    public static void main(String[] args) {
        /**
         * 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요
         * 객체를 생성하기 위한 설계도 == Class
         * 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 함.
         * 객체(인스턴스)를 생성하고 나면 객체에 접근할 수 있는 참조값(x001 등의 주소)를 반환
         * 참조값을 변수에 보관해야 하는 이유: 객체에 접근할 수 있는 방법이 필요하기 때문. 그래서 변수에 보관하고 사용함.
         * 객체 사용: .(점, dot)을 사용하여 객체에 접근하고 사용한다.
         * 기능(메서드), 속성(변수)
         * 속성(변수) 예시: name, age, grade
         */
        Student student1;
        student1 = new Student(); // 학생을 실제 메모리에 만든다. (객체 또는 인스턴스라 칭함), 참조값 보관
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // 다른 학생을 담는다.
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:" + student1.name + " 나이:" +  student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" +  student2.age + " 성적:" + student2.grade);

        // 참조값 출력 @뒤가 참조값 basic.section2.class1.Student@452b3a41
        System.out.println(student1);
        System.out.println(student2);
    }

}
