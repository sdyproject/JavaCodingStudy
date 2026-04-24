package algorithm.programmers.Lv1;

public class 이웃한_칸 {

    public static void main(String[] args) {
//        String[][] board = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"},
//                {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
//        int h = 1;
//        int w = 1;
        // 2

        String[][] board = {{"yellow", "green", "blue"}, {"blue", "green", "yellow"},
                {"yellow", "blue", "blue"}};
        int h = 0;
        int w = 1;
        int answer = 0;
        String color = board[h][w];
        int[] harr = {0, 1, -1, 0};
        int[] warr = {1, 0, 0, -1};
        for (int i = 0; i < 4; i++) {
            int checkh = h + harr[i];
            int checkw = w + warr[i];
            if (0 <= checkh && checkh < board.length && checkw < board.length && 0 <= checkw) {
                if (board[checkh][checkw].equals(color)) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}