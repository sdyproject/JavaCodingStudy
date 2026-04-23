package algorithm.programmers.Lv1;

public class 공원_산책 {

    public static void main(String[] args) {

//        String[] park = {"SOO", "OOO", "OOO"};
//        String[] routes = {"E 2", "S 2", "W 1"};

//        String[] park = {"SOO", "OXX", "OOO"};
//        String[] routes = {"E 2", "S 2", "W 1"};

        String[] park = {"OSO", "OOO", "OXO", "OOO"};
        String[] routes = {"E 2", "S 3", "W 1"};
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

            int x = startx;
            int y = starty;
            for (int j = 0; j < step; j++) {
                if (way.equals("E")) {
                    y++;
                } else if (way.equals("W")) {
                    y--;
                } else if (way.equals("N")) {
                    x--;
                } else {
                    x++;
                }

                if (x < park.length && y < park[0].length() && x >= 0 && y >= 0) {

                    if (ch[x][y] == 'X') {
                        break;
                    }
                    if (i == step - 1) {
                        startx = x;
                        starty = y;
                    }


                }


            }


        }
        System.out.println(startx);
        System.out.println(starty);

    }
}