package intermediate2.class2.collection.set.javaset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSetMain {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>(); // 입력한 순서를 보장하지 않음.
        Set<String> linkedHashSet = new HashSet<>(); // 입력한 순서를 정확히 보장함.
        Set<String> treeSet = new TreeSet<>(); // 크다, 작다라는 기준이 필요함. 1, 2, 3 또는 "A", "B", "C" 처럼.

        run(new HashSet<>());
        run(new LinkedHashSet<>());
        run(new TreeSet<>());

    }

    private static void run(Set<String> set){
        System.out.println("set = " + set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){ //hasNext() : 다음 데이터가 있는지 확인
            System.out.println(iterator.next() + " "); //next() : 다음 데이터를 반환
        }
        System.out.println();
    }
}
