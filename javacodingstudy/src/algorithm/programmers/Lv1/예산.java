package algorithm.programmers.Lv1;

import java.util.Arrays;

public class 예산 {

    public static void main(String[] args) {
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;

//        int[] d = {2, 2, 3, 3};
//        int budget = 10;
        int answer = 0;
        int count = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            count += d[i];
            if (count > budget) {
                break;
            }
            answer++;
        }
        System.out.println(answer);

    }
}