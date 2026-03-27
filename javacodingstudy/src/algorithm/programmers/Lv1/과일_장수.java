package algorithm.programmers.Lv1;

import java.util.Arrays;

public class 과일_장수 {

    public static void main(String[] args) {
        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};
//        int k = 4;
//        int m = 3;
//        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
//         사과 상태에 따라 1부터 k 점
//         k == 최상품 사과 1점 최하위점 사과
//         한상자에 사과를 m개 담는다
//         담긴 사과중 가장 낮은 점수 p(1 <= p <= k)인 경우 p * m * 1박스 = 가격
//         얻을수 있는 최대 이익 계산하고자 한다.(상자 단위로 판매되며 남은 사과 버린다.)

        int answer = 0;
        Arrays.sort(score);
        for (int i = score.length % m; i < score.length; i += m) {
            answer += score[i];
        }
        System.out.println(answer * m);
    }

}
