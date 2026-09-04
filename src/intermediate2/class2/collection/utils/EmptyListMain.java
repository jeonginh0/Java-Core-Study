package intermediate2.class2.collection.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EmptyListMain {

    public static void main(String[] args) {
        // 빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        // 빈 불변 리스트 생성
        List<Object> list3 = Collections.emptyList(); // Java5 옛날에 만들어진 것
        List<Integer> list4 = List.of(); // Java9 최근에 만들어진 것

        System.out.println("list3.getClass() = " + list3.getClass());
        System.out.println("list4.getClass() = " + list4.getClass());

        List<Integer> list5 = Arrays.asList(1, 2, 3);
        List<Integer> list6 = List.of(1, 2, 3);

        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> arrList = Arrays.asList(arr); //참조값을 가져다 쓰는 것이기 때문에 값도 arr 배열 값도 같이 바뀐다.
        arrList.set(0, 100);

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arrList = " + arrList);

        //웬만하면 List.of()를 사용하는 것을 권장한다.
    }

}
