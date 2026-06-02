package intermediate1.section.class1.object.equals;

public class EqualsMainV2 {

    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity = " + (user1 == user2)); //참조값이 다름 동일성 만족 X
        System.out.println("equality = " + (user1.equals(user2))); //오버라이딩 된 equals 사용
    }
}
