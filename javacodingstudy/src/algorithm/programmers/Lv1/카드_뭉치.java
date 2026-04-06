package algorithm.programmers.Lv1;

import java.util.ArrayDeque;
import java.util.Queue;

public class 카드_뭉치 {
    public static void main(String[] args) {
//        String[] cards1 = {"i", "drink", "water"};
//        String[] cards2 = {"want", "to"};
//        String[] goal = {"i", "want", "to", "drink", "water"};

        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        String answer = "Yes";

        Queue<String> que1 = new ArrayDeque<>();
        Queue<String> que2 = new ArrayDeque<>();

        for (int i = 0; i < cards1.length; i++) {
            que1.add(cards1[i]);
        }
        for (int i = 0; i < cards2.length; i++) {
            que2.add(cards2[i]);

        }

        for (String str : goal) {
            if (!que1.isEmpty() && str.equals(que1.peek())) {
                que1.poll();
            } else if (!que2.isEmpty() && str.equals(que2.peek())) {
                que2.poll();
            } else {
                answer = "No";
                break;
            }
        }


        System.out.println(answer);
    }
}