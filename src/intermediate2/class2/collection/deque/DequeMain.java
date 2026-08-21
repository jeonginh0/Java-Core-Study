package intermediate2.class2.collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeMain {

    public static void main(String[] args) {

        /**
         * ArrayDeque vs LinkedList
         *
         * ArrayDeque가 모든 면에서 빠르다.
         *
         * ArrayDeque는 추가로 특별한 원형 큐 자료 구조를 사용하는데, 앞 뒤 입력 모두 O(1)의 성능을 제공한다.
         * 물론 LinkedList도 앞, 뒤 입력 모두 O(1)의 성능을 제공한다.
         *
         * 100만 건 입력(앞, 뒤 평균)
         * ArrayDeque: 110ms
         * LinkedList: 480ms
         *
         * 100만 건 조회(앞, 뒤 평균)
         * ArrayDeque: 9ms
         * LinkedList: 20ms
         */
        Deque<Integer> deque = new ArrayDeque<>();
//        Deque<Integer> deque = new LinkedList<>();

        //데이터 추가
        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque);
        deque.offerLast(3);
        System.out.println(deque);
        deque.offerLast(4);
        System.out.println(deque);

        //다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());

        //데이터 꺼내기
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println("deque.pollLast() = " + deque.pollLast());
    }

}
