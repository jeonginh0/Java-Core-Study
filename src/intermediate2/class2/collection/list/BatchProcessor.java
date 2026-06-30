package intermediate2.class2.collection.list;

/*
데이터를 앞에서 추가하거나 삭제할 때 빅오
MyArrayList: O(n)
MyLinkedList: O(1)

MyList list의 구현체를 선택할 지는 실행 시점에 생성자를 통해 결정
마치 의존 관계가 외부에서 주입되는 것 같다고 해서 이것을 의존관계 주입이라고 한다.
생성자 의존관게 주입.

 */
public class BatchProcessor {

    private final MyList<Integer> list;

    //MyList = MyArrayList
    //MyList = MyLinkedList
    //의존 관계 주입
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i); //앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");

    }
}
