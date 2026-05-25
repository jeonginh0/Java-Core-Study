package basic.section.class4;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자는 인스턴스를 생성하고 나서 즉시 호출된다.

    /**
     * 생성자 장점: 메서드 호출 X(중복 코드 제거
     */
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}
