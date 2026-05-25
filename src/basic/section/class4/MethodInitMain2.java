package basic.section.class4;

public class MethodInitMain2 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "정인호", 26, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "정준호", 21, 100);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름: " + member.name);
            System.out.println("나이: " +member.age);
            System.out.println("성적: " +member.grade);
            System.out.println();
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }

}
