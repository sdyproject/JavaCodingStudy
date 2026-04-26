package algorithm.programmers.Lv1;

import java.util.Arrays;

public class 바탕화면_정리 {

    public static void main(String[] args) {
        String[] wallpaper = {".#...", "..#..", "...#."};

//        String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};

//        String[] wallpaper = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};

        char[][] ch = new char[wallpaper.length][wallpaper[0].length()];
        for (int i = 0; i < wallpaper.length; i++) {
            ch[i] = wallpaper[i].toCharArray();
        }
        System.out.println(Arrays.deepToString(ch));


    }
}