package algorithm.programmers.Lv0;

public class 직사각형_넓이_구하기 {

    public static void main(String[] args) {
        int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        //출력 : 1
//        int[][] dots = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        //출력 : 4

        int x = dots[0][0];
        int y = dots[0][1];
        int w = 0;
        int l = 0;
        for (int i = 1; i < dots.length; i++) {
            if (x != dots[i][0]) {
                w = Math.abs(x - dots[i][0]);
            }
            if (y != dots[i][1]) {
                l = Math.abs(y - dots[i][1]);
            }
        }
        System.out.println(w * l);

    }
}