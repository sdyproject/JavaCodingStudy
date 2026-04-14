package algorithm.programmers.Lv1;

import java.util.Arrays;

public class 공원_산책 {

    public static void main(String[] args) {
//        String[] park = {"SOO", "OOO", "OOO"};
//        String[] routes = {"E 2", "S 2", "W 1"};
//        String[] park = {"SOO", "OXX", "OOO"};
//        String[] routes = {"E 2", "S 2", "W 1"};
        String[] park = {"OSO", "OOO", "OXO", "OOO"};
        String[] routes = {"E 2", "S 3", "W 1"};

        int w = park[0].length();
        int h = park.length;

        int startX = 0;
        int startY = 0;
        char[][] p_size = new char[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                p_size[i][j] = park[i].charAt(j);
                if (p_size[i][j] == 'S') {
                    startY = i;
                    startX = j;
                }
            }
        }

        for (String route : routes) {
            String way = route.split(" ")[0];
            int step = Integer.valueOf(route.split(" ")[1]);

            int nextY = startY;
            int nextX = startX;

            for (int i = 0; i < step; i++) {
                if (way.equals("E")) {
                    nextY++;
                } else if (way.equals("W")) {
                    nextY--;
                } else if (way.equals("S")) {
                    nextX++;
                } else {
                    nextX--;
                }
                if (nextX >= 0 && nextY >= 0 && nextX < p_size.length && nextY < p_size[0].length) {
                    if (p_size[nextX][nextY] == 'X') {
                        break;
                    }

                    if (i == step - 1) {
                        startX = nextX;
                        startY = nextY;
                    }
                }
            }


        }
        int[] answer = new int[2];
        answer[0] = startX;
        answer[1] = startY;
        System.out.println(Arrays.toString(answer));

    }
}
