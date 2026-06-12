package intermediate2.class1.generic.ex2;

public class Box<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public T set() {
        return value;
    }

}
