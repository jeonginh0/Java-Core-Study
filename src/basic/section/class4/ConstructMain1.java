package basic.section.class4;

public class ConstructMain1 {

    public static void main(String[] args) {

        MemberConstruct member1 = new MemberConstruct("정인호", 26, 90);
        MemberConstruct member2 = new MemberConstruct("정호인", 10, 100);
        MemberConstruct member3 = new MemberConstruct("호인정", 15, 100);

        MemberConstruct[] members = {member1, member2, member3};

        for (MemberConstruct member : members) {
            System.out.println("이름: " + member.name + ", 나이: " + member.age + ", 성적: " + member.grade);
        }
    }

}
