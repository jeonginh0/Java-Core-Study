package intermediate2.class2.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {

    public static void main(String[] args) {

        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("A", 50);
        System.out.println(studentMap);

        // 학생 없는 경우에만 추가1
        if (!studentMap.containsKey("A")) {
            studentMap.put("A", 100);
        }
        System.out.println(studentMap); //추가 안됐음. 키가 이미 있었기 때문.

        // 학생 없는 경우에만 추가2
        studentMap.putIfAbsent("A", 100); //추가 안됨. 키가 이미 있었기 때문.
        studentMap.putIfAbsent("B", 100); //추가됨. 키가 없었기 때문.
        System.out.println(studentMap);
    }

}
