package intermediate2.class2.collection.array;

import java.util.Arrays;

public class ArrayMain1 {

    public static void main(String[] args) {
        /*
        1. 배열의 경우 인덱스를 사용하면 한번의 연산으로 매우 효율적으로 자료의 위치를 찾을 수 있다.
        2. 배열의 시작 참조 + (자료의 크기 * 인덱스 위치)
        -> arr[0]: x100 + (4byte * 0): x100
        -> arr[1]: x100 + (4byte * 1): x104
        즉, 순차 검색의 경우 배열 크기만큼의 연산이 필요하다.
         */

        int[] arr = new int[5];
        //index 입력: O(1)
        System.out.println("==index 입력: O(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        //index 변경: O(1)
        System.out.println("==index 변경: O(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        //index 조회: O(1)
        System.out.println("==index 조회: O(1)==");
        System.out.println("arr[2] = " + arr[2]);

        //배열 검색: O(n)
        System.out.println("==배열 검색: O(n)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
            if (arr[i] == value) {
                System.out.println(value + " 찾음");
                break;
            }
        }
    }

}
