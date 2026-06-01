package basic.section.class9.overriding;

public class CarMain {

    /**
     * 메서드 오버로딩: 메서드 이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것
     * 메서드 오버라이딩: 상속 관계에서 사용하며 부모의 메서드(기능)을 자식이 다시 정의하는 것. @Override 애노테이션을 넣어야 함.
     */
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();

    }

}
