package intermediate1.section.class2.immutable.address;

public class ImmutableAddress {

    private final String value; //한번 생성자에서 생성하고 나면 바꾸는게 불가능.

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
            "value='" + value + '\'' +
            '}';
    }
}
