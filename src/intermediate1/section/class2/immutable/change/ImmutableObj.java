package intermediate1.section.class2.immutable.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result); //생성한 객체를 반환
    }

    public int getValue() {

        return value;
    }
}
