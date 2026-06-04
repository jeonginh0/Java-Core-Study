package intermediate1.section.class2.immutable.address;

public class RefMain1_1 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산"); //b의 값을 부산으로 변경해야 함.
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /*
        참조형 변수들은 같은 참조값을 통해 같은 인스턴스를 참조할 수 있다.
        즉 변수명은 다르지만 변수 내 참조하고 있는 인스턴스는 같기 때문에 해당 인스턴스의 값을 두 변수가 제어하고 변경할 수 있다.
         */
    }

}
