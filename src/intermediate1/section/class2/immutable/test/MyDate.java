package intermediate1.section.class2.immutable.test;

public class MyDate {
    private final int year;
    private final int month;
    private final int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate withYear(int newYear) {
        return new MyDate(newYear, this.month, this.day);
    }

    public MyDate withMonth(int newMonth) {
        return new MyDate(this.year, newMonth, this.day);
    }

    public MyDate withDay(int newDay) {
        return new MyDate(this.year, this.month, newDay);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
