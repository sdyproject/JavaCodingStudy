package algorithm.programmers.Lv2;

import java.util.PriorityQueue;

public class 더_맵게 {

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            queue.offer(scoville[i]);
        }
        while (queue.peek() < K) {
            int first = queue.poll();
            int second = queue.poll();
            queue.add(first + (second * 2));
            answer++;
        }
        if (queue.peek() < K) {
            answer = -1;
        }
        System.out.println(answer);

    }
}