package intermediate2.class2.collection.map.test;

import java.util.HashMap;

public class WordFrequencyTest2 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        HashMap<String, Integer> textMap = new HashMap<>();

        //코드 작성
        String[] textArr = text.split(" ");
        for (String word : textArr) {
            textMap.put(word, textMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(textMap);
    }
}
