package algorithm.programmers.Lv2;

import java.util.Arrays;

public class 주식가격 {

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        int[] answer = new int[prices.length];


        //for문 이용한 풀이

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] <= prices[j]) {
                    answer[i]++;
                } else {
                    answer[i]++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}