package intermediate2.class2.collection.map.test;

import java.util.HashMap;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        HashMap<String, Integer> textMap = new HashMap<>();

        //코드 작성
        String[] textArr = text.split(" ");
        for (String word : textArr) {
            Integer count = textMap.get(word);
            if (count == null) {
                count = 0;
            }
            count ++;
            textMap.put(word, count);
        }

        System.out.println(textMap);
    }
}
