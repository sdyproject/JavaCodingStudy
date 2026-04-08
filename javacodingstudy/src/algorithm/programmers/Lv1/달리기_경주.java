package algorithm.programmers.Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 달리기_경주 {

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        // 출력 ["mumu", "kai", "mine", "soe", "poe"]

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        for (String call : callings) {
            int rank = map.get(call);
            String front = players[rank - 1];
            players[rank - 1] = call;
            players[rank] = front;

            map.put(call, rank - 1);
            map.put(front, rank);
        }

        System.out.println(Arrays.toString(players));
    }

}
