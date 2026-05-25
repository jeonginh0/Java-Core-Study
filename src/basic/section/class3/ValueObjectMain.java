package basic.section.class3;

public class ValueObjectMain {

    /**
     * 메서드는 객체를 생성해야 호출할 수 있다.
     * static이 붙으면 객체를 생성하지 않고도 메서드를 호출할 수 있다.
     */
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println("최종 숫자 = " + valueData.value);
    }

}
