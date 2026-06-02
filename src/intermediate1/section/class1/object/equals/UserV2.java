package intermediate1.section.class1.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    /*
    UserV2의 동등성은 id(고객번호)로 비교
    equals()는 Object 타입을 매개변수로 사용함. 객체의 특정 값을 사용하려면 다운캐스팅이 필요.
    여기서는 현재 인스턴스(this)에 있는 id문자열과 비교 대상으로 넘어온 객체의 id문자열을 비교
    UserV2에 있는 id는 String. 문자열 비교는 == 이 아니라 equals()를 사용해야 함.
     */
//    @Override
//    public boolean equals(Object obj) {
//        UserV2 user = (UserV2) obj;
//        return id.equals(user.id);
//    }


    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
