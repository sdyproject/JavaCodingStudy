package algorithm.programmers.Lv0;

import java.util.Arrays;

public class 정사각형으로_만들기 {

    public static void main(String[] args) {
//        int[][] arr = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
//        int[][] arr = {{572, 22, 37, 2}, {287, 726, 384, 1}};
        int[][] arr = {{572, 22}, {287, 726}};

        int col = arr[0].length;
        int row = arr.length;
        int len = Math.max(row, col);
        int[][] answer = new int[len][len];
        for (int i = 0; i < row; i++) {
            answer[i] = Arrays.copyOf(arr[i], len);
        }

        System.out.println(Arrays.deepToString(answer));
    }
}