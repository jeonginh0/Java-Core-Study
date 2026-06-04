package intermediate1.section.class3.string.chaining;

public class ValueAdder {
    private int value;

    public ValueAdder add(int addvalue) {
        value += addvalue;
        return this;
    }

    public int getValue() {
        return value;
    }
}
