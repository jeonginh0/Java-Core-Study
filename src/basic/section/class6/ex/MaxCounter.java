package basic.section.class6.ex;

public class MaxCounter {
    int count = 0;
    int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (maxCountValid(max)) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }

    public int getCount() {
        return count;
    }

    private boolean maxCountValid(int max) {
        return count >= max;
    }
}
