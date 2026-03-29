package algorithm.programmers.Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 대충_만든_자판 {

    public static void main(String[] args) {
//        String[] keymap = {"ABACD", "BCEFD"};
//        String[] targets = {"ABCD", "AABB"};

//        String[] keymap = {"AA"};
//        String[] targets = {"B"};
//
        String[] keymap = {"AGZ", "BSSS"};
        String[] targets = {"ASA", "BGZ"};

        int[] answer = new int[targets.length];


        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char ch = keymap[i].charAt(j);
                int index = map.getOrDefault(ch, j + 1);
                map.put(ch, Math.min(index, j + 1));

            }
        }

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                char key = targets[i].charAt(j);
                int value = map.getOrDefault(key, 0);
                if (value == 0) {
                    answer[i] = -1;
                    break;
                } else {
                    answer[i] += value;
                }

            }
        }
        System.out.println(Arrays.toString(answer));
    }
}