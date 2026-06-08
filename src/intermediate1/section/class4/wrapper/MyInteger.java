package intermediate1.section.class4.wrapper;

public class MyInteger {
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        //return "" + value; //문자 + 숫자는 문자로 반환
        return String.valueOf(value); //문자로 변환하여 반환
    }
}
