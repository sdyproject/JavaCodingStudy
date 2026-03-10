package algorithm.programmers.Lv0;

import java.util.Arrays;


public class 등수_매기기 {
    public static void main(String[] args) {
//		int[][] score = {{80, 70},{90, 50},{40, 70},{50,80}};
        int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};


        int[] answer = new int[score.length];
        int[] num = new int[score.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = (score[i][0] + score[i][1]) / 2;
        }

        System.out.println(Arrays.toString(num));

        for (int i = 0; i < num.length; i++) {
            int rank = 1;
            for (int j = 0; j < num.length; j++) {
                if (num[i] < num[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        System.out.println(Arrays.toString(answer));


        //중복되는 점수 처리 x
//		ArrayList<Integer> answer =  new ArrayList<>();
//		Map<Integer, Integer>map =  new TreeMap<>(Comparator.reverseOrder());
//		for (int i = 0; i < score.length; i++) {
//			
//			 map.put(score[i][0] + score[i][1], i+1);
//		}
//		System.out.println(map);
//		for(Integer val: map.values()) {
//			answer.add(val);
//		}
//		System.out.println(answer);


    }

}
