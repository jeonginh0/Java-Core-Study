package intermediate2.class2.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class JavaMapMain {

    public static void main(String[] args) {
        run(new HashMap<>());
        run(new LinkedHashMap<>());
        run(new TreeMap<>());
    }

    private static void run(Map<String, Integer> map) {
        System.out.println("map = " + map.getClass());
        if (map.getClass() == HashMap.class) {
            System.out.println("순서 보장 X, 가장 빠름");
        } else if (map.getClass() == LinkedHashMap.class) {
            System.out.println("키를 기준으로 입력한 순서 보장 O");
        } else {
            System.out.println("키 자체의 데이터 값 기준으로 정렬");
        }
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("1", 40);
        map.put("2", 50);

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " = " + map.get(key) + " ");
        }
        System.out.println();
    }

}
