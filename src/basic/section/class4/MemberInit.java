package basic.section.class4;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        this.name = name; // this == 자기 자신의 인스턴스를 가리킴.
        this.age = age;
        this.grade = grade;
    }
}
