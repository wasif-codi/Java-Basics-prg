package coreJava.basic;

import java.util.HashMap;
import java.util.Map;

public class CountOc {
    public static void main(String[] args) {
        String input = "hello World Delhi";

        Map<Character, Integer> map = new HashMap<>();
        char[] chars = input.toLowerCase().toCharArray();

        for (char ch : chars) {
            if (ch != ' ') {
                if (!map.containsKey(ch)) {
                    map.put(ch, 1);
                } else {
                    int value = map.get(ch);
                    map.put(ch, value + 1);
                }
            }

        }
        System.out.println(map);
    }
}
