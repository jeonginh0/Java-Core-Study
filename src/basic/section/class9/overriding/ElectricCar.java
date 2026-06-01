package basic.section.class9.overriding;

public class ElectricCar extends Car {

    /*
    - 오버라이딩 조건 -
    1. 메서드 이름: 같아야 함
    2. 메서드 파라미터: 파라미터 타입, 순서, 개수가 같아야 함
    3. 반환 타입: 같아야 함
    4. 접근 제어자: 상위 클래스보다 제한적이어서는 안됨
    5. 예외: throws로 많은 예외를 선언할 수 없음
    6. static, final, private: 키워드가 붙은 메서드는 오버라이딩 불가
    7. 생성자 오버라이딩: 생성자는 오버라이딩 할 수 없음
     */
    @Override // 오버라이드
    public void move() {
        System.out.println("전기차를 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
