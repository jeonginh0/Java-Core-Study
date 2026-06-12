package intermediate2.class1.generic.ex1;

public class BoxMain1 {

    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10); //오토 박싱
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("java");
        String string = stringBox.get();
        System.out.println("string = " + string);

        /*
        위와 같이 코드를 작성하고 Double, Boolean을 포함한 다양한 타입을 담는 박스가 필요하다면 타입별로 클래스를 더 생성해야 한다
        담는 타입이 수십개라면 수십개의 XxxBox클래스를 만들어야 한다.

        다양한 데이터의 타입을 받네? -> 다형성 적용
         */
    }

}
