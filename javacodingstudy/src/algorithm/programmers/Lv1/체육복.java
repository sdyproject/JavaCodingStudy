package algorithm.programmers.Lv1;

import java.util.Arrays;

public class 체육복 {
    // 실패
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
//        int n = 5;
//        int[] lost = {2, 4};
//        int[] reserve = {3};
//        int n = 3;
//        int[] lost = {3};
//        int[] reserve = {1};

//        int n = 5;
//        int[] lost = {1, 3};
//        int[] reserve = {1, 2};

        Arrays.sort(lost);
        Arrays.sort(reserve);
        int answer = n - lost.length;
        for (int i = 0; i < lost.length; i++) {
            int front = lost[i] - 1;
            int back = lost[i] + 1;
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    reserve[j] = 0;
                    break;
                }

                if (front == reserve[j] || back == reserve[j]) {
                    reserve[j] = 0;
                    answer++;
                    break;
                }
            }

        }
        System.out.print(answer);
    }

}
