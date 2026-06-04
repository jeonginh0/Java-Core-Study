package intermediate1.section.class2.immutable.change;

public class ImmutableMain {

    public static void main(String[] args) {
        //불변 객체에서 변경과 관련된 메서드들은 보통 객체를 새로 만들어서 반환하기 때문에 꼭 반환값을 받아야 한다.
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20);

        //계산 이후의 기존 값과 신규값 모두 확인 가능
        System.out.println("obj1 = " + obj1.getValue());
        System.out.println("obj2 = " + obj2.getValue());
    }

}
