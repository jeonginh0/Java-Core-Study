package intermediate2.class1.generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        /*
        기본형은 안됨, 사용할 타입을 미리 결정하지 않음.
         */

        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성 시점에 T의 타입 결정
        integerBox.set(10);
        //integerBox.set("문자100"); //Integer 타입만 허용, 컴파일 오류 발생!!
        System.out.println("integerBox = " + integerBox.get());

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("test");
        //stringBox.set(10); //String 타입만 허용, 컴파일 오류 발생!!
        System.out.println("stringBox = " + stringBox.get());

        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.5);
        System.out.println("doubleBox = " + doubleBox.get());

        //타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> IntegerBox2 = new GenericBox<>();
    }

}
