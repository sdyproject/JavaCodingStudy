package algorithm.programmers.Lv1;

import java.util.Arrays;

public class 공원_산책 {

    public static void main(String[] args) {

//        String[] park = {"SOO", "OOO", "OOO"};
//        String[] routes = {"E 2", "S 2", "W 1"};

        String[] park = {"SOO", "OXX", "OOO"};
        String[] routes = {"E 2", "S 2", "W 1"};
        int[] answer = new int[2];
        char[][] ch = new char[park.length][park[0].length()];
        int startx = 0;
        int starty = 0;
        for (int i = 0; i < park.length; i++) {
            ch[i] = park[i].toCharArray();
            if (park[i].contains("S")) {
                startx = i;
                starty = park[i].indexOf("S");
            }
        }
        System.out.println(startx);
        System.out.println(starty);
        System.out.println();
        for (int i = 0; i < routes.length; i++) {
            String way = routes[i].split(" ")[0];
            int step = Integer.valueOf(routes[i].split(" ")[1]);
            if (way.equals("E")) {
                startx += step;
            } else if (way.equals("S")) {
                starty += step;
            } else if (way.equals("W")) {
                startx -= step;
            } else {
                starty -= step;
            }

            
            System.out.println(ch[starty][startx]);


        }

        answer[0] = starty;
        answer[1] = startx;
        System.out.println(Arrays.toString(answer));
    }
}