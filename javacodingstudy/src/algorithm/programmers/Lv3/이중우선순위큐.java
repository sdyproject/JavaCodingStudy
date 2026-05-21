package algorithm.programmers.Lv3;

import java.util.PriorityQueue;

public class 이중우선순위큐 {

    public static void main(String[] args) {
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (String str : operations) {
            String cmd = str.split(" ")[0];
            int data = Integer.valueOf(str.split(" ")[1]);

            if (cmd.equals("I")) {
                pq.add(data);
//            } else {
//                if (data == -1) {
//                    pq.poll();
//                } else {
//
//                }
//            }
            }
            System.out.println(pq);
        }

        
    }
}