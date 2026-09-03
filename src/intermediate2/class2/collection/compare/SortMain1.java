package intermediate2.class2.collection.compare;

import java.util.Arrays;

public class SortMain1 {

    public static void main(String[] args) {
        /* TIP 정렬 알고리즘
        1. 먼저 가장 왼쪽에 있는 데이터와 그 다음 데이터를 비교한다.
        2. 다음 차례의 둘을 비교한다.
        3. 이렇게 처음부터 끝까지 비교하면 마지막 항목은 가장 큰 값이 된다.
        4. 반복

        자바는 데이터가 작을 때 '듀얼 피벗 퀵소트(Dual-Pivot QuickSort)를 사용하고,
        데이터가 많을 때는 팀소트(TimSort)를 사용하낟. 이런 알고리즘은 평균 O(n log n)의 성능을 제공한다.
         */
        Integer[] array = {3, 2, 1};
        System.out.println(Arrays.toString(array));

        System.out.println("기본 정렬 후");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

}
