package basic.section.class9.ex1;

public class CarMain {

    public static void main(String[] args) {
        /*
        전기차와 가솔린차는 자동차의 조금 더 디테일한 개념이다.
        반대로 자동차(Car)는 전기차와 가솔린차를 포함하는 추상적인 개념이다.
        둘의 공통기능이 보인다. -> move()
        이동하는 것은 똑같기에 상속 개념을 도입하면 효과적이다.
         */
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
