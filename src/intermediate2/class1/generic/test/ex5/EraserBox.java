package intermediate2.class1.generic.test.ex5;

public class EraserBox<T> {

    /*
    아래 메서드들이 왜 오류가 나냐
    타입 이레이저 때문임.
    실행시점(런타임)에 모두 Object가 되어버린다.
    instanceof는 항상 Object와 비교하게 된다. 이렇게 되면 항상 참이 반환되는 문제 발생한다. 그래서 타입 매개변수에 instanceof를 허용하지 않는다.
    new T는 항상 new Object가 되어버린다. 개발자가 의도한 것과는 다르다. 따라서 자바는 타입 매개변수에 new를 허용하지 않는다.
     */
    public boolean instanceCheck(Object param) {
        //return param instanceof T; //컴파일 오류 발생
        return false;
    }

    public void create() {
        //return new T(); //컴파일 오류 발생
    }

}
