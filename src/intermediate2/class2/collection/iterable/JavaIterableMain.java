package intermediate2.class2.collection.iterable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaIterableMain {
    /* TIP
    Iterator(반복자) 디자인 패턴은 객체 지향 프로그래밍에서 컬렉션의 요소들을 순회할 때 사용되는 디자인 패턴이다.
    이 패턴은 컬렉션의 내부 표현 방식을 노출시키지 않으면서도 그 안의 각 요소에 순차적으로 접근할 수 있게 해준다.
    Iterator 패턴은 컬렉션 구현과는 독립적으로 요소들을 탐색할 수 있는 방법을 제공하며, 이로 인해 코드의 복잡성을 줄이고 재사용성을 높일 수 있다.
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        printAll(list.iterator());
        printAll(set.iterator());
        foreach(list);
        foreach(set);
    }

    private static void foreach(Iterable<Integer> iterable) {
        System.out.println("foreach = " + iterable.getClass());
        for (Integer i : iterable) {
            System.out.println(i);
        }
    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator = " + iterator.getClass());
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
