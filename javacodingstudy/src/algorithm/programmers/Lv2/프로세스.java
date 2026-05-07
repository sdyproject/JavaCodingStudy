package algorithm.programmers.Lv2;

import java.util.Collections;
import java.util.PriorityQueue;

public class 프로세스 {

    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};

        int location = 2;

        int answer = 0;
//        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
//        Queue<Integer> q = new LinkedList<>();
//
//        for (int i = 0; i < priorities.length; i++) {
//            p.add(priorities[i]);
//            q.add(priorities[i]);
//        }
//
//        System.out.println(p);
//        System.out.println(q);
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < priorities.length; i++) {
            p.add(priorities[i]);
        }
        out:
        while (!p.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (p.peek() == priorities[i]) {
                    p.poll();
                    answer++;
                    if (i == location) {
                        break out;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}