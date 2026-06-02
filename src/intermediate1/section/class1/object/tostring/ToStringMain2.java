package intermediate1.section.class1.object.tostring;

public class ToStringMain2 {

    /*
    Car 인스턴스는 toString()을 재정의하지 않아서 Object가 제공하는 기본 toString() 메서드를 사용
    Dog 인스턴스는 toString()을 재정의 한 덕분에 객체의 상태를 명확하게 확인할 수 있다.
     */
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        //Integer.toHexString 메서드를 사용하면 16진수로 바뀜
        String refValue1 = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue1 = " + refValue1); // 문자로 변경됨.

        String refValue2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println("refValue2 = " + refValue2); // 문자로 변경됨.

        /*
        객체의 참조값 직접 출력
        toString()은 기본으로 객체의 참조값을 출력한다.
         */
    }

}
