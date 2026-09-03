package intermediate2.class2.collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {

    /*
    1. MyArray는 Iterable(반복할 수 있는) 인터페이스를 구현한다. MyArray는 반복할 수 있다는 의미가 있다.
    2. Iterable 인터페이스를 구현하면 Iterator() 메서드를 구현해야 한다. 이 메서드는 Iterator 인터페이스를 구현한
    반복자를 반환한다. 여기서는 MyArrayIterator를 생성해서 반환했다.
     */

    private int currentIndex = -1;
    private int[] targetArr;

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < targetArr.length - 1;
    }
    @Override
    public Integer next() {
//        currentIndex++;
//        int result = targetArr[currentIndex];
//        return result;
        return targetArr[++currentIndex];
    }

}
