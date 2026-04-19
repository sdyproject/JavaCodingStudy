package algorithm.programmers.Lv1;

import java.util.Arrays;

public class 공원_산책 {

    public static void main(String[] args) {

//        String[] park = {"SOO", "OOO", "OOO"};
//        String[] routes = {"E 2", "S 2", "W 1"};

        String[] park = {"SOO", "OXX", "OOO"};
        String[] routes = {"E 2", "S 2", "W 1"};

        int startx = 0;
        int starty = 0;
        char[][] ch = new char[park.length][park[0].length()];
        for (int i = 0; i < park.length; i++) {
            ch[i] = park[i].toCharArray();
            if (park[i].contains("S")) {
                startx = i;
                starty = park[i].indexOf("S");
            }
        }

        System.out.println(Arrays.deepToString(ch));
        for (int i = 0; i < routes.length; i++) {
            String way = routes[i].split(" ")[0];
            int step = Integer.valueOf(routes[i].split(" ")[1]);


        }
    }
}