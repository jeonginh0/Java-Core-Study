package intermediate1.section.class5.enumeration.ex3;

public enum Grade {
    /*
    열거형도 클래스
    열거형은 자동으로 java.lang.Enum을 상속받는다.
    외부에서 임의로 생성할 수 없다.
    타입 안정성 향상: 열거형은 사전에 정의된 상수들로만 구성되므로, 유효하지 않은 값이 입력될 가능성이 없다.
    간결성 및 일관성: 열거형을 사용하면 코드가 더 간결하고 명확해지며, 데이터의 일관성이 보장된다.
    확장성: 새로운 회원 등급을 추가하고 싶을 때, ENUM에 새로운 상수를 추가하기만 하면 된다.
     */
    BASIC, GOLD, DIAMOND
}
