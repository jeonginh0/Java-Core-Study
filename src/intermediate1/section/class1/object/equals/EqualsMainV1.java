package intermediate1.section.class1.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2)); //참조값이 다름 동일성 만족 X
        System.out.println("equality = " + (user1.equals(user2))); //위와 같음. Object가 기본으로 제공하는 equals()는 ==으로 동일성 비교를 제공함.
    }
}
