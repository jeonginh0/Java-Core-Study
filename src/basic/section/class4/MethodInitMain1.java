package basic.section.class4;

public class MethodInitMain1 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "정인호";
        member1.age = 26;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "정준호";
        member2.age = 21;
        member2.grade = 100;

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름: " + member.name);
            System.out.println("나이: " +member.age);
            System.out.println("성적: " +member.grade);
            System.out.println();
        }
    }

}
