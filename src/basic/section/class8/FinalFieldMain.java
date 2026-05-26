package basic.section.class8;

public class FinalFieldMain {

    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10); // 이후 값 수정 불가
        ConstructInit constructInit2 = new ConstructInit(20); // 이후 값 수정 불가
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        // final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println("fieldInit1.value = " + fieldInit1.value);
        System.out.println("fieldInit2.value = " + fieldInit2.value);
        System.out.println("fieldInit3.value = " + fieldInit3.value);

        // 상수 접근
        System.out.println("상수 호출");
        System.out.println(FieldInit.CONST_VALUE);
    }

}
