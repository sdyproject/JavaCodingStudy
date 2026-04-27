package algorithm.programmers.Lv2;

import java.util.HashMap;
import java.util.Map;

public class 의상 {

    public static void main(String[] args) {
        /*
         * */
        String[][] clothes = {{"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

//        String[][] clothes = {{"crow_mask", "face"},
//                {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        System.out.println(map);

        for (String str : map.keySet()) {
            answer *= map.get(str) + 1;
        }
        answer -= 1;
        System.out.println(answer);

    }
}