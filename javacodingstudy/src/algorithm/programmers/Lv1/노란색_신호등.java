package algorithm.programmers.Lv1;

import java.util.Arrays;

public class 노란색_신호등 {

    public static void main(String[] args) {
        /*어떤 도로에 차량 신호등이 n개 있습니다. 모든 신호등은 항상 초록불 → 노란불 → 빨간불 순서로 반복되며,
         각 신호의 지속 시간은 신호등마다 다릅니다. 시간은 1초부터 시작하며, 각 신호등은 처음에는 초록불 상태로 시작합니다.
         이 도로에서는 가끔 정전이 일어나는데, 모든 신호등이 모두 노란불이 되면 정전이 발생한다는 사실이 밝혀졌습니다.
         예를 들어 신호등이 2개이고, 각 신호등의 주기가 다음과 같다고 가정해 보겠습니다.
         신호등	초록불	노란불	빨간불
         1번	2초	    1초	    2초
         2번	5초	    1초	    1초

         제한사항
        2 ≤ signals의 길이 = n ≤ 5
        signals의 원소는 [G, Y, R] 형태의 길이가 3인 정수 배열입니다.
        순서대로 초록불, 노란불, 빨간불의 지속 시간을 의미합니다.
        1 ≤ G, Y, R ≤ 18
        3 ≤ G + Y + R ≤ 20

         */


        int[][] signals = {{2, 1, 2}, {5, 1, 1}};
        //3 6 >
//        int[][] signals = {{2, 3, 2}, {3, 1, 3}, {2, 1, 1}};

//        int[][] signals = {{3, 3, 3}, {5, 4, 2}, {2, 1, 2}};
//        int[][] signals = {{1, 1, 4}, {2, 1, 3}, {3, 1, 2},{4,1,1}};

        //초기 시작값: signals[0] + 1 지속 시간: 초기 시작값 + signals[1]
        // 다음 노란색 값 : 지속시간 +signals[2] + signals[0] +1;
        int answer = -1;
        int len = 1;
        for (int i = 0; i < signals.length; i++) {
            int g = signals[i][0];
            int y = signals[i][1];
            int r = signals[i][2];

            len *= (g + y + r);
        }
        int[] arr = new int[len + 1];

        for (int i = 0; i < signals.length; i++) {
            int g = signals[i][0];
            int y = signals[i][1];
            int r = signals[i][2];

            int num = (g + y + r);

            for (int j = 1; j <= len; j += num) {
                for (int k = 0; k < y; k++) {
                    arr[g + j + k]++;
                }
            }
        }

        for (int i = 0; i <= len; i++) {
            if (arr[i] == signals.length) {
                answer = i;
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(answer);
    }
}