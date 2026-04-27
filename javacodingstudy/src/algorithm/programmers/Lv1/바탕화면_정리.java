package algorithm.programmers.Lv1;

public class 바탕화면_정리 {

    public static void main(String[] args) {
//        String[] wallpaper = {".#...", "..#..", "...#."};

//        String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};

        String[] wallpaper = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};

        int lux = wallpaper[0].length();
        int luy = wallpaper.length;
        int rdx = 0;
        int rdy = 0;

        char[][] ch = new char[wallpaper.length][wallpaper[0].length()];
        for (int i = 0; i < wallpaper.length; i++) {
            ch[i] = wallpaper[i].toCharArray();
            if (wallpaper[i].contains("#")) {
                int h = wallpaper[i].indexOf("#");
                lux = Math.min(lux, i);
                luy = Math.min(luy, h);

                rdx = Math.max(rdx, i + 1);
                rdy = Math.max(rdy, h + 1);
            }
        }
        System.out.print(lux);
        System.out.print(luy);
        System.out.print(rdx);
        System.out.print(rdy);


    }
}