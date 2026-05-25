package basic.section.class4;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; // 변수 이름이 다르기 떄문에 Scope상 멤버변수꺼를 가져다 씀.
    }
}
