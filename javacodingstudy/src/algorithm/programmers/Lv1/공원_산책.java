package algorithm.programmers.Lv1;

import java.util.Arrays;

public class 공원_산책 {

    public static void main(String[] args) {

//        String[] park = {"SOO", "OOO", "OOO"};
//        String[] routes = {"E 2", "S 2", "W 1"};

        String[] park = {"SOO", "OXX", "OOO"};
        String[] routes = {"E 2", "S 2", "W 1"};

//        String[] park = {"OSO", "OOO", "OXO", "OOO"};
//        String[] routes = {"E 2", "S 3", "W 1"};
        int[] answer = new int[2];
        char[][] ch = new char[park.length][park[0].length()];
        int startw = 0;
        int starth = 0;
        for (int i = 0; i < park.length; i++) {
            ch[i] = park[i].toCharArray();
            if (park[i].contains("S")) {
                startw = park[i].indexOf("S");
                starth = i;
            }
        }
        System.out.println(Arrays.deepToString(ch));
        System.out.println(starth);
        System.out.println(startw);

        for (int i = 0; i < routes.length; i++) {
            String way = routes[i].split(" ")[0];
            int step = Integer.valueOf(routes[i].split(" ")[1]);
            int w = startw;
            int h = starth;

            for (int j = 0; j < step; j++) {
                if (way.equals("E")) {
                    w++;
                } else if (way.equals("W")) {
                    w--;
                } else if (way.equals("N")) {
                    h--;
                } else {
                    h++;
                }

                if (w < park[0].length() && h < park.length && w >= 0 && h >= 0) {
                    if (ch[h][w] == 'X') {
                        break;
                    }
                    if (j == step - 1) {
                        startw = w;
                        starth = h;
                    }
                }
            }
        }
        System.out.println(starth);
        System.out.println(startw);


    }
}