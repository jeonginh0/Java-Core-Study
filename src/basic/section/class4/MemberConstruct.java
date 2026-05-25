package basic.section.class4;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가
    MemberConstruct(String name, int age) {
        // this()는 생성자 코드의 첫 줄에만 작성할 수 있다.
        this(name, age, 50); // 오버로딩된 MemberConstruct로 이동함.
    }

    // 생성자는 인스턴스를 생성하고 나서 즉시 호출된다.
    /**
     * 생성자 장점: 메서드 호출 X(중복 코드 제거
     */
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자.v2 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}
