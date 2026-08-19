package intermediate2.class2.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {

    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        studentMap.put("A", 90);
        System.out.println(studentMap);

        studentMap.put("A", 100); //같은 키에 저장 시 기존 값 교체
        System.out.println(studentMap);

        boolean containsKey = studentMap.containsKey("A");
        System.out.println(containsKey);

        // 특정 학생의 값 삭제
        studentMap.remove("A"); //키로 지우면 값도 사라짐
        System.out.println(studentMap);
    }

}
