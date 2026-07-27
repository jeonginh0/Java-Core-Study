package intermediate2.class2.collection.set.test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
//        List<Integer> list = List.of(inputArr);
//        Set<Integer> set = new LinkedHashSet<>(list);

        //배열을 Set에 입력할 때 직접 배열을 반복하면서 Set에 입력하는 방법도 있지만 더 간단히 해결하는 방법이 있다.
        //Set 구현체의 생성자에 배열은 전달할 수 없지만 List는 전달할 수 있다. 다음과 같이 배열을 List로 변환한다.
        //List<Integer> list1 = Arrays.asList(inputArr);
        //List<Integer> list2 = List.of(inputArr); - 권장 방식
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        for (Integer i : set) {
            System.out.println(i);
        }
    }

}
