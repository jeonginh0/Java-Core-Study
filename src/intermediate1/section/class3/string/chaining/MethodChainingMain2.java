package intermediate1.section.class3.string.chaining;

public class MethodChainingMain2 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue(); //내부 메서드가 this. 즉 참조값을 반환하기 때문에 바로 체인처럼 연결되며 값을 얻을 수 있다.

        System.out.println("result = " + result);
    }

}
