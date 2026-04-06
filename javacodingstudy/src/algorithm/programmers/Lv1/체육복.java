package algorithm.programmers.Lv1;

import java.util.Arrays;

public class 체육복 {

    public static void main(String[] args) {
//        int n = 5;
//        int[] lost = {2, 4};
//        int[] reserve = {1, 3, 5};
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};
//        int n = 3;
//        int[] lost = {3};
//        int[] reserve = {1};

//        int n = 5;
//        int[] lost = {1, 3};
//        int[] reserve = {1, 2};
        int answer = n - lost.length;
        System.out.println(answer + "answer");
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                }
            }
        }
        System.out.println(Arrays.toString(lost));
        System.out.println(Arrays.toString(reserve));
        System.out.println(answer);

        for (int i = 0; i < lost.length; i++) {
            if (lost[i] < 0) {
                continue;
            }
            int front = lost[i] - 1;
            int back = lost[i] + 1;
            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] < 0) {
                    continue;
                }
                if (front == reserve[j] || back == reserve[j]) {
                    answer++;
                    System.out.println(answer);
                    reserve[j] = -1;
                    break;
                }
            }

        }
        System.out.println(answer);
    }

}
